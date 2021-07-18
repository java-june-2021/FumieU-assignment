package com.fumie.loginandreg.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fumie.loginandreg.models.User;
import com.fumie.loginandreg.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository uRepo;
	
	public UserService(UserRepository repo) {
		this.uRepo = repo;
	}
	
	public User registerUser(User user) {
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashed);
		return uRepo.save(user);
	}
	public User findByEmail(String email) {
		return uRepo.findByEmail(email);
	}
	
	
	public User findUserById(Long id) {
		Optional<User> u = uRepo.findById(id);
		
		if(u.isPresent()) {
			return u.get();
		}else {
			return null;
		}
	}
	
	public boolean authenticationUser(String email, String password) {
		User user = uRepo.findByEmail(email);
		if(user == null) {
			return false;
		}else {
			if(BCrypt.checkpw(password, user.getPassword())) {
				return true;
			}else {
				return false;
			}
		}
	}
}
