package com.leprechaun.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.leprechaun.business.FirstNameTranslation;
import com.leprechaun.business.LastNameTranslation;
import com.leprechaun.business.User;
import com.leprechaun.db.*;

@CrossOrigin
@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired 
	private FirstNameTranslationRepo fntRepo;
	
	@Autowired
	private LastNameTranslationRepo lntRepo;
	
	@GetMapping("/")
	public List<User> getAll(){
		return userRepo.findAll();
	}
	
	@PostMapping("/")
	public User create(@RequestBody User u) {
		//generate leprechaun name
		//get first letter of first name 
		String firstLetter = u.getFirstName().substring(0,1);
		//get firstNameTranslation by firstLetter
		//select * from firstNameTranslation WHERE letter = "s"
		FirstNameTranslation fnt = fntRepo.findByLetter(firstLetter);
		//get month = lastNameTranslation
		LastNameTranslation lnt = lntRepo.findByBirthMonth(u.getBirthMonth());
		String leprechaunName = fnt.getTranslation() + " " + lnt.getTranslation();
		u.setLeprechaunName(leprechaunName);
		return userRepo.save(u);
	}
}
