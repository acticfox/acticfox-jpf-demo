package com.github.acticfox.demo.dao;

import java.util.Date;

import org.springframework.stereotype.Repository;

import com.github.acticfox.demo.model.TenderApply;

/**
 * @author kfy
 * @date 2022/08/22
 */
@Repository
public class TenderApplyRepository {

    public TenderApply findTenderApplyByPK(Long tenderApplyId, String tenantId) {
        TenderApply tenderApply = new TenderApply();
        tenderApply.setTenantId(tenantId);
        tenderApply.setNeedRegister(true);
        return new TenderApply();
    }

    public void saveSubmitTime(Long tenderApplyId, String tenantId, Date submitTime) {
        System.out.println(tenantId + " 保存提交时间");
    }

}
