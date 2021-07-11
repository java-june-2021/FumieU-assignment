package com.fumie.license.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fumie.license.models.License;
import com.fumie.license.repositories.LicenseRepository;

@Service
public class LicenseService {
	private final LicenseRepository lRepo;
	
	public LicenseService(LicenseRepository repo) {
		this.lRepo = repo;
	}
	public List<License> getAllLicenses(){
		return this.lRepo.findAll();
	}
	public License getSingleLicense(Long id){
		return this.lRepo.findById(id).orElse(null);
	}
	public License createLicense(License license){
		return this.lRepo.save(license);
	}
	public void deleteLicense(Long id){
		this.lRepo.deleteById(id);
	}
	public void updateLicense(Long id, License license){
		this.lRepo.save(license);
	}
}
