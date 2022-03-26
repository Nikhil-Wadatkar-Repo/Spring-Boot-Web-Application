package com.bs;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Surgeon_Details")
public class SurgeonDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer surgeonId;
	private String surgeonFirstName;
	private String surgeonLastName;
	private String surgeonEmailId;
	private String surgeoncity;

	public SurgeonDetails() {
		super();
	}

	public SurgeonDetails(Integer surgeonId, String surgeonFirstName, String surgeonLastName,
			String surgeonEmailId, String surgeoncity) {
		super();
		this.surgeonId = surgeonId;
		this.surgeonFirstName = surgeonFirstName;
		this.surgeonLastName = surgeonLastName;
		this.surgeonEmailId = surgeonEmailId;
		this.surgeoncity = surgeoncity;
	}



	public Integer getSurgeonId() {
		return surgeonId;
	}

	public void setSurgeonId(Integer surgeonId) {
		this.surgeonId = surgeonId;
	}

	public String getSurgeonFirstName() {
		return surgeonFirstName;
	}

	public void setSurgeonFirstName(String surgeonFirstName) {
		this.surgeonFirstName = surgeonFirstName;
	}

	public String getSurgeonLastName() {
		return surgeonLastName;
	}

	public void setSurgeonLastName(String surgeonLastName) {
		this.surgeonLastName = surgeonLastName;
	}

	public String getSurgeonEmailId() {
		return surgeonEmailId;
	}

	public void setSurgeonEmailId(String surgeonEmailId) {
		this.surgeonEmailId = surgeonEmailId;
	}

	public String getSurgeoncity() {
		return surgeoncity;
	}

	public void setSurgeoncity(String surgeoncity) {
		this.surgeoncity = surgeoncity;
	}

	@Override
	public String toString() {
		return "SurgeonDetails [surgeonId=" + surgeonId + ", surgeonId=" + surgeonId + ", surgeonFirstName=" + surgeonFirstName
				+ ", surgeonLastName=" + surgeonLastName + ", surgeonEmailId=" + surgeonEmailId + ", surgeoncity=" + surgeoncity
				+ "]";
	}

}
