package main;


import java.util.ArrayList;

public class ContactService {
	
	public ArrayList<Contact>  contactList = new ArrayList<Contact>();
	
	public void displayContactList() {
		for (int counter = 0; counter < contactList.size(); counter++) {
			System.out.println("\t Contact ID: " + contactList.get(counter).getContactID());
			System.out.println("\t First Name: " + contactList.get(counter).getFirstName());
			System.out.println("\t Last Name: " + contactList.get(counter).getLastName());
			System.out.println("\t Phone Number: " + contactList.get(counter).getPhone());
			System.out.println("\t Address: " + contactList.get(counter).getAddress() + "\n");
		}
		}
	
	// Adding new contact and assigning to list
	public void addContact(String contactID, String firstName, String lastName, String phone, String address) {
		Contact contact = new Contact(contactID, firstName, lastName, phone, address);
		validateContact(contact);
		contactList.add(contact);
	}
	// Overall validation of contact
	public void validateContact(Contact contact) {
		  contact.validateFirstName();
		  contact.validateLastName();
		  contact.validatePhoneNumber();
		  contact.validateAddress();
		  contact.validateContactID(contactList);
	  }
	
	// Search for contact
	public Contact getContact(String contactID) {
		Contact contact = new Contact(null, null, null, null, null);
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().contentEquals(contactID)) {
				contact = contactList.get(counter);
			}
		}
		return contact;
	}
	
	// Delete contact
	public void deleteContact(String contactID) {
		Contact contact = getContact(contactID);
		if (contact != null) {
			contactList.remove(contact);
			System.out.println("Contact ID: " + contact.getContactID() + " was deleted.");
		}
		else {
			System.out.println("Contact ID: " + contactID + " was not found.");
		}
	}
	
	// Update first name
	public void updateFirstName(String contactID, String updatedString) {
	      Contact contact = getContact(contactID);
	      if (contact != null) {
	    	  contact.setFirstName(updatedString);
	          System.out.println("Contact ID: " + contactID + " first name updated.");
	      } else {
	          System.out.println("Contact ID: " + contactID + " was not found.");
	      }
	  }

	  
	
	// Update last name
	  public void updateLastName(String contactID, String updatedString) {
	      Contact contact = getContact(contactID);
	      if (contact != null) {
	    	  contact.setLastName(updatedString);
	          System.out.println("Contact ID: " + contactID + " last name updated.");
	      } else {
	          System.out.println("Contact ID: " + contactID + " was not found.");
	      }
	  }
	
	// Update phone number
	  public void updatePhone(String contactID, String updatedString) {
		  Contact contact = getContact(contactID);
	      if (contact != null) {
	    	  contact.setPhone(updatedString);
	          System.out.println("Contact ID: " + contactID + " phone number updated.");
	      } else {
	          System.out.println("Contact ID: " + contactID + " was not found.");
	      }
	  }
	  
		// Update address
	  public void updateAddress(String contactID, String updatedString) {
		  Contact contact = getContact(contactID);
	      if (contact != null) {
	    	  contact.setAddress(updatedString);
	          System.out.println("Contact ID: " + contactID + " address updated.");
	      } else {
	          System.out.println("Contact ID: " + contactID + " was not found.");
	      }
	  }
	}
	
