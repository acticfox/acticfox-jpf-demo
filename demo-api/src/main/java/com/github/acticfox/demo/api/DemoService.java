package com.github.acticfox.demo.api;

import com.github.acticfox.common.api.result.ResultDTO;

public interface DemoService {

    /**
     * 提交招标申请
     * 
     * @param tenderApplyId
     * @param tenantId
     * @return
     */
    public ResultDTO<?> submitTenderApply(Long tenderApplyId, String tenantId);

}
