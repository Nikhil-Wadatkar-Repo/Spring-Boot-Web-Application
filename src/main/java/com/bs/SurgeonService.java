package com.bs;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurgeonService {

	@Autowired
	private SurgeonRepo repo;
	static Logger logger =  LoggerFactory.getLogger(SurgeonService.class);
	
	public SurgeonDetails addSurgeon(SurgeonDetails Surgeon) {
		SurgeonDetails savedSurgeon = repo.save(Surgeon);
		return savedSurgeon;
	}

	public String deleteSurgeonById(Integer SurgeonId) {
		Optional<SurgeonDetails> existedSurgeon = repo.findById(SurgeonId);
		if (existedSurgeon.isPresent()) {
			repo.deleteById(SurgeonId);
			return "deleted";
		} else {
			return "Not found";
		}
	}

	public SurgeonDetails updateSurgeon(SurgeonDetails Surgeon) {
		Optional<SurgeonDetails>	findById = repo.findById(Surgeon.getSurgeonId());
		SurgeonDetails pat=findById.get();
		pat.setSurgeonId(Surgeon.getSurgeonId());
		pat.setSurgeoncity(Surgeon.getSurgeoncity());
		pat.setSurgeonEmailId(Surgeon.getSurgeonEmailId());
		pat.setSurgeonFirstName(Surgeon.getSurgeonFirstName());
		pat.setSurgeonLastName(Surgeon.getSurgeonLastName());
		
		return repo.save(pat);
	}

	public List<SurgeonDetails> getAllSurgeon() {
		return repo.findAll();
	}

	public SurgeonDetails getSurgeonById(Integer SurgeonId) {
		return repo.findById(SurgeonId).get();
	}

}
