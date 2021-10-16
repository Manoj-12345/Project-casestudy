package com.example.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.user.CartProfile;

public interface CartRepo extends  MongoRepository<CartProfile, String> {
	CartProfile findProductById(String Id);	


}
