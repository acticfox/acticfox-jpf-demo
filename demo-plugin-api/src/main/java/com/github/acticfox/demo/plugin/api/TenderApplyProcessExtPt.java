package com.github.acticfox.demo.plugin.api;

import java.util.Date;

import com.github.acticfox.demo.model.TenderApply;
import com.github.acticfox.jpf.api.ExtensionPoint;

/**
 * 定标申请业务逻辑处理
 * 
 * @author kfy
 * @date 2022/08/22
 */
public interface TenderApplyProcessExtPt extends ExtensionPoint {

    Integer handleSubmitApply(TenderApply tenderApply, Long tenderApplyId, String tenantId, Date submitTime);

}
