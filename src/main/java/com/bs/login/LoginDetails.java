package com.bs.login;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bs.deal.Deal;

@Entity
@Table
public class LoginDetails {
	@Id
	private int loginId;
	private String username;
	private String password;
	private String token;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "deal_login_id")
	private Deal deal;

	public LoginDetails(int loginId, String username, String password, String token, Deal deal) {
		super();
		this.loginId = loginId;
		this.username = username;
		this.password = password;
		this.token = token;
		this.deal = deal;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public LoginDetails() {
		super();
	}

	public Deal getDeal() {
		return deal;
	}

	public void setDeal(Deal deal) {
		this.deal = deal;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginDetails [loginId=" + loginId + ", username=" + username + ", password=" + password + ", token="
				+ token + ", deal=" + deal + "]";
	}
}