package com.cjc.main;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.neosoft.main.model.User;
import com.neosoft.main.repository.UserRepository;
import com.neosoft.main.serviceImpl.ServiceInterface;


@SpringBootTest
public class SpringRestControllerPojoDbApplicationTests {
	
	@Autowired
	 ServiceInterface servi;
	
	@Autowired
	UserRepository userRepository;
	
	
	@Test
	public void userRegister() {
		User user = new User();
		user.setId(4);
		user.setName("James");
		user.setSurname("Bond");
		user.setAddr("Delhi");
		user.setPincode(010100);
		user.setUn("jamesB");
		user.setPw("jb");
		user.setDob(new Date(1988,01,10));
		user.setJoiningDate(new Date(2015,06,13));
		user.setIsDeleted(0);
		
		User save = servi.save(user);
		assertEquals(user, save);
	}
	
	@Test
	public void loginCheckPurpose() {
		User user = servi.loginCheck("jamesB", "jb");
		assertNull(user);
	}
	
	@Test
	 public void list(){
		
		 List list = servi.listAll();
			assertThat(list);
	 }
	
	
	
	@Test
	 public void update() {
		User user = new User();
		user.setId(2);
		user.setName("Sumit");
		user.setSurname("Maske");
		user.setAddr("Pune");
		user.setPincode(010100);
		user.setUn("sumu");
		user.setPw("maske");
		user.setDob(new Date(1992,07,8));
		user.setJoiningDate(new Date(2018,02,20));
		user.setIsDeleted(0);
		
		User updateUser=servi.save(user);
		assertEquals(user, updateUser);
		
	  }
	@Test
	public void softdelete() {
		User user = servi.loginCheck("jamesB", "jb");
		User deleteSoft=servi.softDelete(user.getId());
		assertThat(deleteSoft);
		
	}
	@Test
	public void harddelete() {
		User user = servi.loginCheck("jamesB", "jb");
		boolean deleteUser=servi.delete(user.getId());
		assertThat(deleteUser);
	}
	
	@Test
	 public void searchBy(){
		List<User> searchList = servi.search("sumu", "maske", 010100);
		assertThat(searchList);
	
		 
	 }
}
