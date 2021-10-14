package com.neosoft.main.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.neosoft.main.model.User;
import com.neosoft.main.repository.UserRepository;

@Service
public class ServiceImpl implements ServiceInterface {

	@Autowired
	UserRepository userRepository;

	
	  @Override 
	  public User loginCheck( String un,String pw) {
	  
	  return userRepository.findByUnAndPw(un, pw);
	  
	  }
	 
	
	  public List<User> listAll(){
		  Sort sort = Sort.by("dob","joiningDate");

	  return (List<User>) userRepository.findAll(sort);
	  }
	
	  public Optional<User> get(int id) {
	  
	  return userRepository.findById(id);
	  
	  }
	  public boolean delete(int id) { 
		  userRepository.deleteById(id);
		  return true;
		 }
	  
	  @Override
	  public User save(User user) {
		
		return userRepository.save(user);
	}
	  
	  @Override
	  public User softDelete(int id) {
		  User us=userRepository.findById(id).get();
		  us.setIsDeleted(1);
		return  userRepository.save(us);
		  
	  }


	@Override
	public List<User> search(String name, String surname, int pincode) {
		
		return userRepository.findAllByNameOrSurnameOrPincode(name, surname, pincode);
	}

	
}


