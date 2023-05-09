package com.lic.metrics.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.lic.metrics.dto.CommonResponseDto;
import com.lic.metrics.exception.ApplicationException;
import com.lic.metrics.exception.RequiredFieldException;
import com.lic.metrics.repository.ProcessPolicyMemberByServiceIdSupportController5Repository;

@Service
public class ProcessPolicyMemberByServiceIdSupportController5ServiceImpl implements ProcessPolicyMemberByServiceIdSupportController5Service {
	
	private ProcessPolicyMemberByServiceIdSupportController5Repository repository;
	
	public ProcessPolicyMemberByServiceIdSupportController5ServiceImpl(ProcessPolicyMemberByServiceIdSupportController5Repository repository) {
		this.repository = repository;
	}

	@Override
	public CommonResponseDto<Map<String, String>> processPolicyMemberByServiceId(Long serviceId) throws RequiredFieldException, ApplicationException {
		return repository.processPolicyMemberByServiceId(serviceId);
	}

}