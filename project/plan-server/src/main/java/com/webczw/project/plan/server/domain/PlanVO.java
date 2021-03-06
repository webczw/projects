package com.webczw.project.plan.server.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class PlanVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3462192041056227695L;
	private Long planId;
	private String planName;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date planStartDate;
	private Date planEndDate;

	public Long getPlanId() {
		return planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Date getPlanStartDate() {
		return planStartDate;
	}

	public void setPlanStartDate(Date planStartDate) {
		this.planStartDate = planStartDate;
	}

	public Date getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(Date planEndDate) {
		this.planEndDate = planEndDate;
	}

}
