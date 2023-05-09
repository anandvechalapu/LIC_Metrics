package com.lic.metrics.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.metrics.model.PolicyFundSearch_PolicySearchController;
import com.lic.metrics.repository.PolicyFundSearch_PolicySearchControllerRepository;

@Service
public class PolicyFundSearch_PolicySearchControllerService {
	
	@Autowired
	private PolicyFundSearch_PolicySearchControllerRepository policyFundSearch_PolicySearchControllerRepository;

	public List<PolicyFundSearch_PolicySearchController> findByProductAndVariantAndTransactionTypeAndTransactionDate(String product, String variant, String transactionType, Date transactionDate) {
		return policyFundSearch_PolicySearchControllerRepository.findByProductAndVariantAndTransactionTypeAndTransactionDate(product, variant, transactionType, transactionDate);
	}

}