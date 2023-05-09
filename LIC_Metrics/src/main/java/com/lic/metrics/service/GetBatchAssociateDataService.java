package com.lic.metrics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.metrics.entity.ClaimMbr;
import com.lic.metrics.repository.GetBatchAssociateDataRepository;

@Service
public class GetBatchAssociateDataService {

    @Autowired
    private GetBatchAssociateDataRepository getBatchAssociateDataRepository;

    public List<ClaimMbr> getAssociatedClaimsData(String masterPolicyNo) {
        return getBatchAssociateDataRepository.findByMasterPolicyNo(masterPolicyNo);
    }
}