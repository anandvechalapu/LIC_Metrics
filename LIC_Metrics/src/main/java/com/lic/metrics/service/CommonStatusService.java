package com.lic.metrics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.metrics.entity.CommonStatusEntity;
import com.lic.metrics.repository.CommonStatusRepository;

@Service
public class CommonStatusService {

	@Autowired
	private CommonStatusRepository commonStatusRepository;
	
	/**
	 * Retrieves a list of common statuses
	 * 
	 * @return list of CommonStatusEntity objects
	 */
	public List<CommonStatusEntity> getAllCommonStatuses(){
		return commonStatusRepository.findAll();
	}
}