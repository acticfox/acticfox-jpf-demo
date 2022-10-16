package com.github.acticfox.demo.plugin;

import java.util.Date;

import com.github.acticfox.demo.model.TenderApply;
import com.github.acticfox.demo.plugin.api.TenderApplyProcessExtPt;
import com.github.acticfox.jpf.api.Extension;

@Extension(tenantId = "A")
public class TenderApplyProcessAExt implements TenderApplyProcessExtPt {

    @Override
    public Integer handleSubmitApply(TenderApply tenderApply, Long tenderApplyId, String tenantId, Date submitTime) {
        // 同步OA
        System.out.println("同步OA审批" + tenantId);
        // 更新招标申请的状态为--审批中
        System.out.println("更新招标申请的状态为--审批中 tenantId:" + tenantId);
        // 给第一节点的所有审批人发送站内信
        System.out.println("给第一节点的所有审批人发送站内信 tenantId:" + tenantId);
        // 给第一节点的所有审批人发送邮件
        System.out.println("给第一节点的所有审批人发送邮件 tenantId:" + tenantId);
        // 给第一节点的所有审批人发送短信
        System.out.println("给第一节点的所有审批人发送短信 tenantId:" + tenantId);
        // 插入提交历史记录
        System.out.println("插入提交历史记录 tenantId:" + tenantId);

        return 1;
    }

}
