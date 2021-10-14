package com.neosoft.main.repository;

import org.springframework.stereotype.Repository;

import com.neosoft.main.model.User;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.lang.String;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

			User findByUnAndPw(String un,String pw);
				
			void save(Optional<User> usertexist);			
			
			//ResponseEntity<Student> findById(String un, String pw);	
			
			  List<User> findAllByNameOrSurnameOrPincode(String name, String surname, int pincode);
			
			
		

}
