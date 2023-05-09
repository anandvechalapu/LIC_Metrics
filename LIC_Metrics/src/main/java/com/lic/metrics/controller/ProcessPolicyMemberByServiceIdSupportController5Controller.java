package com.lic.metrics.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.metrics.dto.CommonResponseDto;
import com.lic.metrics.exception.ApplicationException;
import com.lic.metrics.exception.RequiredFieldException;
import com.lic.metrics.service.ProcessPolicyMemberByServiceIdSupportController5Service;

@RestController
public class ProcessPolicyMemberByServiceIdSupportController5Controller {
	
	@Autowired
	private ProcessPolicyMemberByServiceIdSupportController5Service service;
	
	@GetMapping("/processPolicyMemberByServiceId/{serviceId}")
	public CommonResponseDto<Map<String, String>> processPolicyMemberByServiceId(@PathVariable Long serviceId) throws RequiredFieldException, ApplicationException {
		return service.processPolicyMemberByServiceId(serviceId);
	}

}