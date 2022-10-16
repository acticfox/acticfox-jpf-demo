package com.github.acticfox.demo.model;

import java.io.Serializable;

import lombok.Data;

/**
 * @author kfy
 * @date 2022/08/22
 */
@Data
public class ApprovalWorkflow implements Serializable {

    /** 审批流Id */
    private Long id;
    /** 租户id */
    private String tenantId;
    /** 申请的Id */
    private Long applyId;
    /** 申请的名称 */
    private Long applyName;
    /**
     * 当前审批层级
     */
    private Integer currentLevel;

    private boolean passed;

}
