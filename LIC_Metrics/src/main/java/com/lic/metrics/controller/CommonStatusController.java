package com.lic.metrics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.metrics.model.CommonStatusModel;
import com.lic.metrics.service.CommonStatusService;

@RestController
@RequestMapping("/commonStatuses")
public class CommonStatusController {
	
	@Autowired
	private CommonStatusService commonStatusService;
	
	/**
	 * Endpoint to get a list of all common statuses
	 * 
	 * @return list of CommonStatusModel objects
	 */
	@GetMapping
	@ResponseBody
	public List<CommonStatusModel> getAllCommonStatuses() {
		return commonStatusService.getAllCommonStatuses();
	}
}