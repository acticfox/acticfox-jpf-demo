package com.github.acticfox.demo.plugin;

import java.util.Date;

import com.github.acticfox.demo.biz.WorkflowUtil;
import com.github.acticfox.demo.model.ApprovalWorkflow;
import com.github.acticfox.demo.model.TenderApply;
import com.github.acticfox.demo.plugin.api.TenderApplyProcessExtPt;
import com.github.acticfox.jpf.api.Extension;

@Extension
public class TenderApplyProcessDefaultExt implements TenderApplyProcessExtPt {

    @Override
    public Integer handleSubmitApply(TenderApply tenderApply, Long tenderApplyId, String tenantId, Date submitTime) {
        // 构建审批流申请
        System.out.println("构建审批流 租户" + tenantId);
        ApprovalWorkflow approvalWorkflow = WorkflowUtil.buildWorkflow(tenantId);
        if (approvalWorkflow.isPassed()) {
            // 审批通过发送供应商邀请
            System.out.println("审批通过发送供应商邀请 tenantId:" + tenantId);
            // 插入提交历史记录
            System.out.println("插入提交历史记录tenantId:" + tenantId);

            return 1;
        } else {
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

}
