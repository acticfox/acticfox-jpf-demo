package com.github.acticfox.demo.plugin.impl;

import java.util.Objects;

import com.github.acticfox.demo.model.TenderApply;
import com.github.acticfox.demo.plugin.api.TenderApplyValidatorExtPt;
import com.github.acticfox.demo.util.ValidateUtil;
import com.github.acticfox.jpf.api.Extension;

/**
 * @author kfy
 * @date 2022/08/22
 */
@Extension(tenantId = "D")
public class TenderApplyValidatorDExt implements TenderApplyValidatorExtPt {

    /* (non-Javadoc)
     * @see com.zhichubao.demo.plugin.api.TenderApplyValidator#validationTenderApply(com.zhichubao.demo.api.TenderApply)
     */
    public void validationTenderApply(TenderApply tenderApply) {
        ValidateUtil.checkState(Objects.nonNull(tenderApply), "无法获得申请！");
        // 如果需要报名审核则判断此报名截止时间
        if (tenderApply.isNeedRegister()) {
            System.out.println("校验规则：报名截止时间不能早于当前时间");
            System.out.println("校验规则：投标截止时间不能早于报名时间");
            // TODO:校验招标申请的内容是否填写完整(需要校验必填项)
        }

        // 校验我添加的供应商是否在事件采购品类
        System.out.println("校验规则：商品采购品类需唯一");
        System.out.println("校验规则：采购品类与供应商不匹配,请重新添加供应商");

    }

}
