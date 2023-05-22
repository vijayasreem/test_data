package com.testt.testdata.service; 

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import com.testt.testdata.model.Users; 
import com.testt.testdata.repository.UserRepository; 

@Service 
public class UserService { 

	@Autowired 
	UserRepository userRepository; 

	public List<Users> getAllUsers(){ 
		return userRepository.findAll(); 
	} 

	public Users getUserByUserName(String userName){ 
		return userRepository.findByUserName(userName); 
	} 

	public Users getUserByPassword(String password){ 
		return userRepository.findByPassword(password); 
	} 

	public Users getUserByLevel(String level){ 
		return userRepository.findByLevel(level); 
	} 

	public Users getUserByParentType(String parentType){ 
		return userRepository.findByParentType(parentType); 
	} 

	public Users getUserByWholesaler(String wholesaler){ 
		return userRepository.findByWholesaler(wholesaler); 
	} 

	public Users getUserByBranch(String branch){ 
		return userRepository.findByBranch(branch); 
	} 

	public Users getUserByFirstName(String firstName){ 
		return userRepository.findByFirstName(firstName); 
	} 

	public Users getUserByLastName(String lastName){ 
		return userRepository.findByLastName(lastName); 
	} 

	public Users getUserByCompany(String company){ 
		return userRepository.findByCompany(company); 
	} 

	public Users getUserByPostcode(String postcode){ 
		return userRepository.findByPostcode(postcode); 
	} 

	public Users getUserByTelephoneNo(String telephoneNo){ 
		return userRepository.findByTelephoneNo(telephoneNo); 
	} 

	public Users getUserByEmailAddress(String emailAddress){ 
		return userRepository.findByEmailAddress(emailAddress); 
	} 

	public Users getUserByDateCreated(String dateCreated){ 
		return userRepository.findByDateCreated(dateCreated); 
	} 

	public Users getUserByLastModified(String lastModified){ 
		return userRepository.findByLastModified(lastModified); 
	} 

}