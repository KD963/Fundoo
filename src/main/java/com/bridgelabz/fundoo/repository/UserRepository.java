package com.bridgelabz.fundoo.repository;

import java.util.Optional;

import javax.jws.soap.SOAPBinding.Use;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.fundoo.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
	Optional<User> findByEmailid(String emailid);
	

}
