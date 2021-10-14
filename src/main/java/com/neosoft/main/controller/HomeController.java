package com.neosoft.main.controller;


import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.main.model.User;
import com.neosoft.main.serviceImpl.ServiceImpl;
import com.neosoft.main.serviceImpl.ServiceInterface;

@RestController
public class HomeController {

	@Autowired
	 ServiceInterface servi;
	
	
	  @RequestMapping(value = "login/{un}/{pw}",method =RequestMethod.GET,produces = "application/json")
	  @ResponseBody 
	  public User loginCheck(@PathVariable("un")String
	  un,@PathVariable("pw")String pw) {
	  
	  User u =(User) servi.loginCheck(un, pw);
	  
	  return u;
	  }
	  
	  @RequestMapping(value = "/reg",method = RequestMethod.POST,produces = "application/json")
	  public void add( @RequestBody User user) 
	  {
	  servi.save(user);
	  }
	 
	
	  @RequestMapping(value = "/login",method = RequestMethod.GET,produces = "application/json")
	  public List<User> list()
	  { 
		   return servi.listAll(); 
		  }
	


		@RequestMapping(value = "/hdl/{id}",method = RequestMethod.DELETE,produces = "application/json")
		public void harddelete(@PathVariable int id)
		{
			servi.delete(id);
			}

		@RequestMapping(value = "/sdl/{id}",method = RequestMethod.DELETE,produces = "application/json")
		public void softdelete(@PathVariable int id)
		{
			servi.softDelete(id);
			}


		  @RequestMapping(value = "/up/{id}",method = RequestMethod.PUT,produces = "application/json") 
		  public Optional<User> update(@RequestBody User user,@PathVariable int id) { 
			
			  servi.save(user);
			  
			  return servi.get(id);
		  }
		  
		  
		  @RequestMapping(value = "/login/search",method =RequestMethod.GET,
				 produces = "application/json")
		  @ResponseBody 
		  public List<User> searchBy(@RequestParam(required = false) String name,
				  @RequestParam(required = false) String surname,
				  @RequestParam(required = false) int pincode) {
			  System.out.println("search");
			List<User> u1=  servi.search(name, surname, pincode);
			  return u1; 
			 
		 }
	 

}
