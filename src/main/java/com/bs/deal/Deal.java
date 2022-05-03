package com.bs.deal;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.bs.party.PartyDetails;

@Entity
@Table
public class Deal {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dealId;
	private String product;
	private String facilityLetterDate;
	private String agreementDate;
	private String accountName;
	private String state;
	private String sanctionLetterDate;
	private String detalis;
	@OneToMany(targetEntity = PartyDetails.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "fk_col", referencedColumnName = "dealId")
	private Set<PartyDetails> children;

	public Deal() {
		super();
	}

	

	public Deal(int dealId, String product, String facilityLetterDate, String agreementDate, String accountName,
			String state, String sanctionLetterDate, String detalis, Set<PartyDetails> children) {
		super();
		this.dealId = dealId;
		this.product = product;
		this.facilityLetterDate = facilityLetterDate;
		this.agreementDate = agreementDate;
		this.accountName = accountName;
		this.state = state;
		this.sanctionLetterDate = sanctionLetterDate;
		this.detalis = detalis;
		this.children = children;
	}



	public Set<PartyDetails> getChildren() {
		return children;
	}

	public void setChildren(Set<PartyDetails> children) {
		this.children = children;
	}

	public int getDealId() {
		return dealId;
	}

	public void setDealId(int dealId) {
		this.dealId = dealId;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getFacilityLetterDate() {
		return facilityLetterDate;
	}

	public void setFacilityLetterDate(String facilityLetterDate) {
		this.facilityLetterDate = facilityLetterDate;
	}

	public String getAgreementDate() {
		return agreementDate;
	}

	public void setAgreementDate(String agreementDate) {
		this.agreementDate = agreementDate;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSanctionLetterDate() {
		return sanctionLetterDate;
	}

	public void setSanctionLetterDate(String sanctionLetterDate) {
		this.sanctionLetterDate = sanctionLetterDate;
	}

	public String getDetalis() {
		return detalis;
	}

	public void setDetalis(String detalis) {
		this.detalis = detalis;
	}



	@Override
	public String toString() {
		return "Deal [dealId=" + dealId + ", product=" + product + ", facilityLetterDate=" + facilityLetterDate
				+ ", agreementDate=" + agreementDate + ", accountName=" + accountName + ", state=" + state
				+ ", sanctionLetterDate=" + sanctionLetterDate + ", detalis=" + detalis + ", children=" + children
				+ "]";
	}

	

}
