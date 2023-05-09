package com.lic.metrics.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "claim_mbr")
public class ClaimMbr implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "claim_mbr_id")
	private Integer claimMbrId;

	@Column(name = "master_policy_no")
	private String masterPolicyNo;

	@Column(name = "claim_no")
	private String claimNo;

	@Column(name = "sequence_no")
	private Integer sequenceNo;

	public Integer getClaimMbrId() {
		return claimMbrId;
	}

	public void setClaimMbrId(Integer claimMbrId) {
		this.claimMbrId = claimMbrId;
	}

	public String getMasterPolicyNo() {
		return masterPolicyNo;
	}

	public void setMasterPolicyNo(String masterPolicyNo) {
		this.masterPolicyNo = masterPolicyNo;
	}

	public String getClaimNo() {
		return claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public Integer getSequenceNo() {
		return sequenceNo;
	}

	public void setSequenceNo(Integer sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

}