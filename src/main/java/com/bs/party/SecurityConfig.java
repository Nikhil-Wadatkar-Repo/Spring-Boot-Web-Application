package com.bs.party;

import org.springframework.context.annotation.Configuration;

public class SecurityConfig /* extends WebSecurityConfigurerAdapter */{
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.csrf().disable().authorizeRequests().antMatchers("/get").hasAnyRole(
	 * "user").and().formLogin();
	 * http.csrf().disable().authorizeRequests().antMatchers("/getAll").hasAnyRole(
	 * "admin").and().formLogin(); }
	 * 
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception {
	 * auth.inMemoryAuthentication().withUser("user").password("password").roles(
	 * "user");
	 * auth.inMemoryAuthentication().withUser("admin").password("password").roles(
	 * "admin"); }
	 */	
}
