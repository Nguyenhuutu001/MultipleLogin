package com.tu.Multiplelogin.admin;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
	public User findByEmail(String email);
}
