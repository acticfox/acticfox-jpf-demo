package com.github.acticfox.demo.plugin.api;

import com.github.acticfox.demo.model.TenderApply;
import com.github.acticfox.jpf.api.ExtensionPoint;

/**
 * 提交定标申请校验
 * 
 * @author kfy
 * @date 2022/08/22
 */
public interface TenderApplyValidatorExtPt extends ExtensionPoint {

    public void validationTenderApply(TenderApply tenderApply);

}
