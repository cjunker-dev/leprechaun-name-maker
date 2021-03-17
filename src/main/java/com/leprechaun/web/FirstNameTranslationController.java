package com.leprechaun.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.leprechaun.business.FirstNameTranslation;
import com.leprechaun.db.FirstNameTranslationRepo;

@CrossOrigin
@RestController
@RequestMapping("/api/first-names")
public class FirstNameTranslationController {
	
	@Autowired
	private FirstNameTranslationRepo firstNameRepo;
	
	@GetMapping("/")
	public List<FirstNameTranslation> getAll(){
		return firstNameRepo.findAll();
	}
	
	
	
}
