package com.fumie.dojoninja.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fumie.dojoninja.models.Dojo;
import com.fumie.dojoninja.repositories.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository dRepo;
	
	public DojoService(DojoRepository repo) {
		this.dRepo = repo;
	}
	public List<Dojo> getAllDojos(){
		return this.dRepo.findAll();
	}
	public Dojo getSingleDojo(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	public Dojo createDojo(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	public void deleteDojo(Long id) {
		this.dRepo.deleteById(id);
	}
	public void updateDojo(Long id, Dojo dojo) {
		this.dRepo.save(dojo);
	}
}	
