package com.github.acticfox.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class TenderApply implements Serializable {

    /**
     * 默认版本号
     */
    public static final Long DEFAULT_VERSION = 1L;

    /**
     * 事件ID
     */
    private Long id;

    /**
     * 租户Id
     */
    private String tenantId;

    /**
     * 创建者Id,统一使用租户下员工Id
     */
    private Long createrId;

    /**
     * 招标事件Id
     */
    private Long tenderId;

    /**
     * 事件编号
     */
    private String code;

    /**
     * 事件名称
     */
    private String name;

    /**
     * 节约金额
     */
    private BigDecimal budget;

    /**
     * 招标方式
     */
    private Integer tenderType;

    /**
     * 招标人id
     */
    private Long tenderUserId;

    /**
     * 招标人部门id
     */
    private Long tenderUserDepartmentId;

    /**
     * 招标人部门名称
     */
    private String tenderUserDepartmentName;

    /**
     * 招标人json
     */
    private String tenderUserDepartmentObj;

    /**
     * 开标方式
     */
    private Integer bidOpenType;

    /**
     * 招标人名片是否公开
     */
    private Boolean isTenderUserCardOpen;

    /**
     * 招标人名片中的名字
     */
    private String tenderUserCardName;

    /**
     * 招标人名片中的联系电话
     */
    private String tenderUserCardPhone;

    /**
     * 招标人名片中的email
     */
    private String tenderUserCardEmail;

    /**
     * 报名申请截止时间
     */
    private Date registrationDeadlineTime;

    /**
     * 报名附件
     */
    private Long registrationAttachment;

    /**
     * 时间附件id
     */
    private Long tenderAttachment;

    /**
     * 投标截止时间
     */
    private Date bidDeadlineTime;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 是否封标
     */
    private Boolean isSealed;

    /**
     * 是否已经删除
     */
    private Boolean isDeleted;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 更新时间
     */
    private Date gmtModified;

    /**
     * 提交申请的时间
     */
    private Date gmtSubmit;

    /**
     * 事件描述
     */
    private String desc;

    /**
     * 报名要求
     */
    private String registrationNotice;

    /**
     * 招标公告
     */
    private String tenderNotice;

    /**
     * 是否是测试事件,默认是否
     */
    private Boolean isTest;

    private boolean needRegister;

}
