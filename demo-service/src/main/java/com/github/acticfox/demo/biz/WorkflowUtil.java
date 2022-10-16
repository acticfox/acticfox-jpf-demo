package com.github.acticfox.demo.biz;

import org.apache.commons.lang.StringUtils;

import com.github.acticfox.demo.model.ApprovalWorkflow;

/**
 * @author kfy
 * @date 2022/08/22
 */
public class WorkflowUtil {

    public static ApprovalWorkflow buildWorkflow(String tenantId) {
        ApprovalWorkflow approvalWorkflow = new ApprovalWorkflow();
        approvalWorkflow.setTenantId(tenantId);
        if (StringUtils.equals(tenantId, "fuchuang") || StringUtils.equals(tenantId, "guijiu")) {
            approvalWorkflow.setPassed(true);
        }

        return approvalWorkflow;

    }

}
