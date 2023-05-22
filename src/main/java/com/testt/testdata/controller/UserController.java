package com.testt.testdata.controller; 

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 
import com.testt.testdata.model.Users; 
import com.testt.testdata.service.UserService; 

@RestController 
@RequestMapping("/user") 
public class UserController { 

	@Autowired 
	UserService userService; 

	@GetMapping("/all") 
	public List<Users> getAllUsers(){ 
		return userService.getAllUsers(); 
	} 

	@GetMapping("/{userName}") 
	public Users getUserByUserName(@PathVariable String userName){ 
		return userService.getUserByUserName(userName); 
	} 

	@GetMapping("/password/{password}") 
	public Users getUserByPassword(@PathVariable String password){ 
		return userService.getUserByPassword(password); 
	} 

	@GetMapping("/level/{level}") 
	public Users getUserByLevel(@PathVariable String level){ 
		return userService.getUserByLevel(level); 
	} 

	@GetMapping("/parentType/{parentType}") 
	public Users getUserByParentType(@PathVariable String parentType){ 
		return userService.getUserByParentType(parentType); 
	} 

	@GetMapping("/wholesaler/{wholesaler}") 
	public Users getUserByWholesaler(@PathVariable String wholesaler){ 
		return userService.getUserByWholesaler(wholesaler); 
	} 

	@GetMapping("/branch/{branch}") 
	public Users getUserByBranch(@PathVariable String branch){ 
		return userService.getUserByBranch(branch); 
	} 

	@GetMapping("/firstName/{firstName}") 
	public Users getUserByFirstName(@PathVariable String firstName){ 
		return userService.getUserByFirstName(firstName); 
	} 

	@GetMapping("/lastName/{lastName}") 
	public Users getUserByLastName(@PathVariable String lastName){ 
		return userService.getUserByLastName(lastName); 
	} 

	@GetMapping("/company/{company}") 
	public Users getUserByCompany(@PathVariable String company){ 
		return userService.getUserByCompany(company); 
	} 

	@GetMapping("/postcode/{postcode}") 
	public Users getUserByPostcode(@PathVariable String postcode){ 
		return userService.getUserByPostcode(postcode); 
	} 

	@GetMapping("/telephoneNo/{telephoneNo}") 
	public Users getUserByTelephoneNo(@PathVariable String telephoneNo){ 
		return userService.getUserByTelephoneNo(telephoneNo); 
	} 

	@GetMapping("/emailAddress/{emailAddress}") 
	public Users getUserByEmailAddress(@PathVariable String emailAddress){ 
		return userService.getUserByEmailAddress(emailAddress); 
	} 

	@GetMapping("/dateCreated/{dateCreated}") 
	public Users getUserByDateCreated(@PathVariable String dateCreated){ 
		return userService.getUserByDateCreated(dateCreated); 
	} 

	@GetMapping("/lastModified/{lastModified}") 
	public Users getUserByLastModified(@PathVariable String lastModified){ 
		return userService.getUserByLastModified(lastModified); 
	} 
}