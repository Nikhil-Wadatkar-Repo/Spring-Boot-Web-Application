package com.bs.party;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bs.exception.UserNotFoundException;

@RestController
public class PartyController {

	@Autowired
	private PartyServiceI service;
	@Autowired
	private PartyRepo repo;
	
	@GetMapping("/get")
	public PartyDetails get() {
		throw new UserNotFoundException("gela");
//		return new PartyDetails(12,"party1", "part1@gmail.com", "1234567899", "party type 1", "larven", "morshi", "morshi");
	}
	
	
	@GetMapping("/getAll")
	public List<PartyDetails> getAllPartyDetails() {
		return service.getAllPartyDetails();
	}
	
	
	
	
}
