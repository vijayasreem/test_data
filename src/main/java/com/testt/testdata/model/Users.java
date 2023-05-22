package com.testt.testdata.model; 

import javax.persistence.Entity; 
import javax.persistence.Id; 
import javax.persistence.Table; 

@Entity 
@Table(name="users") 
public class Users { 

	@Id 
	private Long id; 

	private String userName; 
	private String password; 
	private String level; 
	private String parentType; 
	private String wholesaler; 
	private String branch; 
	private String firstName; 
	private String lastName; 
	private String company; 
	private String postcode; 
	private String telephoneNo; 
	private String emailAddress; 
	private String dateCreated; 
	private String lastModified; 

	public Long getId() { 
		return id; 
	} 

	public void setId(Long id) { 
		this.id = id; 
	} 

	public String getUserName() { 
		return userName; 
	} 

	public void setUserName(String userName) { 
		this.userName = userName; 
	} 

	public String getPassword() { 
		return password; 
	} 

	public void setPassword(String password) { 
		this.password = password; 
	} 

	public String getLevel() { 
		return level; 
	} 

	public void setLevel(String level) { 
		this.level = level; 
	} 

	public String getParentType() { 
		return parentType; 
	} 

	public void setParentType(String parentType) { 
		this.parentType = parentType; 
	} 

	public String getWholesaler() { 
		return wholesaler; 
	} 

	public void setWholesaler(String wholesaler) { 
		this.wholesaler = wholesaler; 
	} 

	public String getBranch() { 
		return branch; 
	} 

	public void setBranch(String branch) { 
		this.branch = branch; 
	} 

	public String getFirstName() { 
		return firstName; 
	} 

	public void setFirstName(String firstName) { 
		this.firstName = firstName; 
	} 

	public String getLastName() { 
		return lastName; 
	} 

	public void setLastName(String lastName) { 
		this.lastName = lastName; 
	} 

	public String getCompany() { 
		return company; 
	} 

	public void setCompany(String company) { 
		this.company = company; 
	} 

	public String getPostcode() { 
		return postcode; 
	} 

	public void setPostcode(String postcode) { 
		this.postcode = postcode; 
	} 

	public String getTelephoneNo() { 
		return telephoneNo; 
	} 

	public void setTelephoneNo(String telephoneNo) { 
		this.telephoneNo = telephoneNo; 
	} 

	public String getEmailAddress() { 
		return emailAddress; 
	} 

	public void setEmailAddress(String emailAddress) { 
		this.emailAddress = emailAddress; 
	} 

	public String getDateCreated() { 
		return dateCreated; 
	} 

	public void setDateCreated(String dateCreated) { 
		this.dateCreated = dateCreated; 
	} 

	public String getLastModified() { 
		return lastModified; 
	} 

	public void setLastModified(String lastModified) { 
		this.lastModified = lastModified; 
	} 

}