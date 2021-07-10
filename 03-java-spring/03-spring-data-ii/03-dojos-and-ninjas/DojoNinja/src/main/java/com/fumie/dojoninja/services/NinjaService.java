package com.fumie.dojoninja.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fumie.dojoninja.models.Ninja;
import com.fumie.dojoninja.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository nRepo;
	
	public NinjaService(NinjaRepository repo) {
		this.nRepo = repo;
	}
	public List<Ninja> getAllNinjas(){
		return this.nRepo.findAll();
	}
	public Ninja getSingleNinja(Long id) {
		return this.nRepo.findById(id).orElse(null);
	}
	public Ninja createNinja(Ninja ninja) {
		return this.nRepo.save(ninja);
	}
	public void deleteNinja(Long id) {
		this.nRepo.deleteById(id);
	}
	public void updateNinja(Long id, Ninja ninja) {
		this.nRepo.save(ninja);
	}
}
