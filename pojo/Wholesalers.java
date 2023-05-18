·       Should be able to access the sub-functionalities like view, edit and download. 
·       Should be able to download the branches as .csv file. 
·       Should be able to filter the data using the drop down menu. 
·       Should be able to reset the selections to the last searches. 

public class Wholesalers {
    private String name;
    private String number;
    private String type;
    private String contactName;
    private String emailAddress;
    private boolean active;
    private Date createdDate;
    private Date lastModified;
    
    public Wholesalers() {
    }
    
    public Wholesalers(String name, String number, String type, String contactName, String emailAddress, boolean active, Date createdDate, Date lastModified) {
        this.name = name;
        this.number = number;
        this.type = type;
        this.contactName = contactName;
        this.emailAddress = emailAddress;
        this.active = active;
        this.createdDate = createdDate;
        this.lastModified = lastModified;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getNumber() {
        return number;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getContactName() {
        return contactName;
    }
    
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }
    
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public boolean isActive() {
        return active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }
    
    public Date getCreatedDate() {
        return createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    public Date getLastModified() {
        return lastModified;
    }
    
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }
    
    public void accessFunctionality(){
        if(hasAccess()){
            //Access the functionality
        }
        else {
            //Redirect to login page
        }
    }
    
    public void findSubFunctionalities(){
        //Find the sub functionalities when user clicks on the functionality
    }
    
    public void accessSubFunctionalities(){
        //Access sub functionalities like edit, view and download
    }
    
    public void downloadData(){
        //Download the branches as .csv file
    }
    
    public void filterData(){
        //Filter the data using the drop down menu
    }
    
    public void resetSelections(){
        //Reset the selections to the last search
    }
    
    public boolean hasAccess(){
        //Check if user has access
        return false;
    }
}