package com.leprechaun.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leprechaun.business.FirstNameTranslation;
import com.leprechaun.business.LastNameTranslation;

public interface LastNameTranslationRepo extends JpaRepository<LastNameTranslation, Integer> {
	LastNameTranslation findByBirthMonth(String birthMonth);
}
