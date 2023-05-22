import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import com.testt.testdata.model.Users; 

@Repository 
public interface UserRepository extends JpaRepository<Users, Long> { 

	Users findByUserName(String userName); 

	Users findByPassword(String password); 

	Users findByLevel(String level); 

	Users findByParentType(String parentType); 

	Users findByWholesaler(String wholesaler); 

	Users findByBranch(String branch); 

	Users findByFirstName(String firstName); 

	Users findByLastName(String lastName); 

	Users findByCompany(String company); 

	Users findByPostcode(String postcode); 

	Users findByTelephoneNo(String telephoneNo); 

	Users findByEmailAddress(String emailAddress); 

	Users findByDateCreated(String dateCreated); 

	Users findByLastModified(String lastModified); 

}