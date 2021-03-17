package com.leprechaun.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leprechaun.business.User;

public interface UserRepo extends JpaRepository<User, Integer> {
}
