package com.leprechaun.business;

import javax.persistence.*;

@Entity
public class FirstNameTranslation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String letter;
	private String translation;
	
	public FirstNameTranslation() {
		super();
	}
	
	public FirstNameTranslation(int id, String letter, String translation) {
		super();
		this.id = id;
		this.letter = letter;
		this.translation = translation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLetter() {
		return letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
	
}
