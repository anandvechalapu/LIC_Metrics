package com.lic.metrics.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.metrics.model.PolicyFundSearch_PolicySearchController;
import com.lic.metrics.service.PolicyFundSearch_PolicySearchControllerService;

@RestController
public class PolicyFundSearch_PolicySearchController {

	@Autowired
	private PolicyFundSearch_PolicySearchControllerService policyFundSearch_PolicySearchControllerService;
	
	@GetMapping("/policySearch")
	public List<PolicyFundSearch_PolicySearchController> findByProductAndVariantAndTransactionTypeAndTransactionDate(@RequestParam String product, @RequestParam String variant, @RequestParam String transactionType, @RequestParam Date transactionDate) {
		return policyFundSearch_PolicySearchControllerService.findByProductAndVariantAndTransactionTypeAndTransactionDate(product, variant, transactionType, transactionDate);
	}
}