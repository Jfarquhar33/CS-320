package main;

//import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayList;

public class Contact {

	  private final String contactID;
	  private String firstName;
	  private String lastName;
	  private String phone;
	  private String address;
	  //private static AtomicLong idGenerator = new AtomicLong();
	  
	  
	  public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		  this.contactID = contactID;
		  this.firstName = firstName;
		  this.lastName = lastName;
		  this.phone = phone;
		  this.address = address;
		  
	  }
	  
	  // Getters
	  public String getContactID() {
		  return contactID;
	  }
	  
	  public String getFirstName() {
		  return firstName;
	  }
	  
	  public String getLastName() {
		  return lastName;
	  }
	  
	  public String getPhone() {
		  return phone;
	  }
	  
	  public String getAddress() {
		  return address;
	  }
	  
	  // Setters
	  public void setFirstName(String firstName) {
		  this.firstName = firstName;
	  }
	  
	  public void setLastName(String lastName) {
		  this.lastName = lastName;
	  }
	  
	  public void setPhone(String phone) {
		  this.phone = phone;
	  }
	  
	  public void setAddress(String address) {
		  this.address = address;
	  }
	  
	  // Validation
	  public void validateFirstName() {
		  if (this.firstName.isBlank()) {
			  throw new RuntimeException("First Name cannot be null or empty");
		  }
		  if (this.firstName.length() > 10) {
			  throw new RuntimeException("First Name cannot be greater than 10 characters");
		  }
	  }
	  
	  public void validateLastName() {
		  if (this.lastName.isBlank()) {
			  throw new RuntimeException("Last Name cannot be null or empty");
		  }
		  if (this.lastName.length() > 10) {
			  throw new RuntimeException("Last Name cannot be greater than 10 characters");
		  }
	  }
	  
	  public void validatePhoneNumber() {
		  if (this.phone.isBlank()) {
			  throw new RuntimeException("Phone number cannot be null or empty");
		  }
		  if (this.phone.length() != 10 ) {
			  throw new RuntimeException("Phone Number should be exactly 10 characters long");
		  }
	  }
	  
	  public void validateAddress() {
		  if (this.address.isBlank()) {
			  throw new RuntimeException("Address cannot be null or empty");
		  }
		  if (this.address.length() > 30) {
			  throw new RuntimeException("Address should be no more than 30 characters long");
		  }
	  }
	  
	  public void validateContactID(ArrayList<Contact> contactList) {
		  if (this.contactID.isBlank()) {
			  throw new RuntimeException("Contact ID cannot be null or empty");
		  }
		  if (this.contactID.length() > 10) {
			  throw new RuntimeException("Contact ID cannot be longer than 10 characters");
		  }
		  for (int counter = 0; counter < contactList.size(); counter++) {
				if (contactList.get(counter).getContactID().contentEquals(contactID)) {
					throw new RuntimeException("Contact ID must be unique");
				}
		  }
	  }
	}
