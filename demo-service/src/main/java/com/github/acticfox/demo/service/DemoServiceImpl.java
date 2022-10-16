package com.github.acticfox.demo.service;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.acticfox.common.api.result.ResultDTO;
import com.github.acticfox.demo.api.DemoService;
import com.github.acticfox.demo.dao.TenderApplyRepository;
import com.github.acticfox.demo.model.TenderApply;
import com.github.acticfox.demo.plugin.api.TenderApplyProcessExtPt;
import com.github.acticfox.demo.plugin.api.TenderApplyValidatorExtPt;
import com.github.acticfox.extension.ExtensionExecutor;
import com.github.acticfox.jpf.api.BizScenario;

/**
 * @author kfy
 * @date 2022/08/22
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private TenderApplyRepository tenderApplyRepository;

    @Autowired
    private ExtensionExecutor extensionExecutor;

    @Override
    public ResultDTO<?> submitTenderApply(Long tenderApplyId, String tenantId) {
        System.out.println(tenantId + "执行提交招标申请开始");
        TenderApply tenderApply = tenderApplyRepository.findTenderApplyByPK(tenderApplyId, tenantId);
        // 执行校验扩展插件
        extensionExecutor.executeVoid(TenderApplyValidatorExtPt.class, BizScenario.valueOf(tenantId),
            extension -> extension.validationTenderApply(tenderApply));
        Date submitTime = new Date();
        // 保存提交时间
        tenderApplyRepository.saveSubmitTime(tenderApplyId, tenantId, submitTime);
        Integer status = extensionExecutor.execute(TenderApplyProcessExtPt.class, BizScenario.valueOf(tenantId),
            extension -> extension.handleSubmitApply(tenderApply, tenderApplyId, tenantId, submitTime));

        System.out.println(tenantId + " 执行提交需求申请结果" + status);
        System.out.println(tenantId + "执行提交招标申请结束 \r\n\n");
        return ResultDTO.buildSuccessResult();
    }

}
