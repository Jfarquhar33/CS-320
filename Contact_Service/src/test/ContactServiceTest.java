package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import main.ContactService;

class ContactServiceTest {
	
	@Test
	public void shouldAddContact() {
		ContactService contactService = new ContactService();
		contactService.addContact("00", "Justin", "Farquhar", "1234567890", "North Arizona Ave");
		Assertions.assertEquals("00", contactService.getContact("00").getContactID());
	}
	
	@Test
	public void shouldDeleteContact() {
		ContactService contactService = new ContactService();
		contactService.addContact("01", "Justin", "Farquhar", "1234567890", "North Arizona Ave");
		contactService.deleteContact("01");
		Assertions.assertEquals(null, contactService.getContact("01").getContactID());
	}
	
	@Test
	public void shouldUpdateFirstName() {
		ContactService contactService = new ContactService();
		contactService.addContact("02", "Justin", "Farquhar", "1234567890", "North Arizona Ave");
		
		contactService.updateFirstName("02", "Mike");
		Assertions.assertEquals("Mike", contactService.getContact("02").getFirstName());
		
	}
	
	@Test
	public void shouldUpdateLastName() {
		ContactService contactService = new ContactService();
		contactService.addContact("03", "Justin", "Farquhar", "1234567890", "North Arizona Ave");
		contactService.updateLastName("03", "Robert");
		Assertions.assertEquals("Robert", contactService.getContact("03").getLastName());
	}
	
	@Test
	public void shouldUpdateAddress() {
		ContactService contactService = new ContactService();
		contactService.addContact("04", "Justin", "Farquhar", "1234567890", "North Arizona Ave");
		
		contactService.updateAddress("04", "South Germain");
		Assertions.assertEquals("South Germain", contactService.getContact("04").getAddress());
		
	}
	
	@Test
	public void shouldUpdatePhone() {
		ContactService contactService = new ContactService();
		contactService.addContact("05", "Justin", "Farquhar", "1234567890", "North Arizona Ave");
		
		contactService.updatePhone("05", "0987654321");
		Assertions.assertEquals("0987654321", contactService.getContact("05").getPhone());
	}
}