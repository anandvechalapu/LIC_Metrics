package com.lic.metrics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.metrics.entity.ClaimMbr;
import com.lic.metrics.service.GetBatchAssociateDataService;

@RestController
@RequestMapping("/claims")
public class GetBatchAssociateDataController {

    @Autowired
    private GetBatchAssociateDataService getBatchAssociateDataService;

    @GetMapping("/{masterPolicyNo}")
    public List<ClaimMbr> getAssociatedClaimsData(@PathVariable("masterPolicyNo") String masterPolicyNo) {
        return getBatchAssociateDataService.getAssociatedClaimsData(masterPolicyNo);
    }

}