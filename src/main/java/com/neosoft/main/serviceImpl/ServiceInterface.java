package com.neosoft.main.serviceImpl;

import java.util.List;
import java.util.Optional;

import com.neosoft.main.model.User;

public interface ServiceInterface {

	

	public User loginCheck( String un,String pw);
	  public List<User> listAll(); 
	  public User save(User user);
	  public  Optional<User> get(int id);
	  public boolean delete(int id);
	  public User softDelete(int id);
	  
	  List<User> search(String name,String surname,int pincode);
	
	
	 
	 
}
