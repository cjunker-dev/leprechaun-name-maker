package com.leprechaun.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leprechaun.business.FirstNameTranslation;
import com.leprechaun.business.User;

public interface FirstNameTranslationRepo extends JpaRepository<FirstNameTranslation, Integer> {
	FirstNameTranslation findByLetter(String s);

}
