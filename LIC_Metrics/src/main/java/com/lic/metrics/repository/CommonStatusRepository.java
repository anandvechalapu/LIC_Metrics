package com.lic.metrics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.metrics.entity.CommonStatusEntity;

@Repository
public interface CommonStatusRepository extends JpaRepository<CommonStatusEntity, Long> {
	
	/**
	 * Retrieves a list of common statuses
	 * 
	 * @return list of CommonStatusEntity objects
	 */
	public List<CommonStatusEntity> findAll();

}