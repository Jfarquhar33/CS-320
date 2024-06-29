package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import main.ContactService;

class ContactTest {
	@Test
	public void shouldThrowRuntimeWhenFirstNameLongerThanTen() {
		ContactService contact = new ContactService();
		Assertions.assertThrows(RuntimeException.class, ()-> {contact.addContact("0", "Nameistoolong", "Doe", "1234567890", "South Arizona");}
		);
	}
	
	@Test
	public void shouldThrowRuntimeWhenFirstNameIsNull() {
		ContactService contact = new ContactService();
		Assertions.assertThrows(RuntimeException.class, ()-> {contact.addContact("1", null, "Doe", "1234567890", "South Arizona");}
		);
	}
	
	@Test
	public void shouldThrowRuntimeWhenLastNameLongerThanTen() {
		ContactService contact = new ContactService();
		Assertions.assertThrows(RuntimeException.class, ()-> {contact.addContact("2", "John", "Nameistoolong", "1234567890", "South Arizona");}
		);
	}
	
	@Test
	public void shouldThrowRuntimeWhenLastNameIsNull() {
		ContactService contact = new ContactService();
		Assertions.assertThrows(RuntimeException.class, ()-> {contact.addContact("3", "John", null, "1234567890", "South Arizona");}
		);
	}
	
	@Test
	public void shouldThrowRuntimeWhenPhoneNotTen() {
		ContactService contact = new ContactService();
		Assertions.assertThrows(RuntimeException.class, ()-> {contact.addContact("4", "John", "Doe", "1", "South Arizona");}
		);
	}
	
	@Test
	public void shouldThrowRuntimeWhenPhoneIsNull() {
		ContactService contact = new ContactService();
		Assertions.assertThrows(RuntimeException.class, ()-> {contact.addContact("5", "John", "Doe", null, "South Arizona");}
		);
	}
	
	@Test
	public void shouldThrowRuntimeWhenAddressLongerThanThirty() {
		ContactService contact = new ContactService();
		Assertions.assertThrows(RuntimeException.class, ()-> {contact.addContact("6", "John", "Doe", "1234567890", "1234567890 South Arizona Avenue");}
		);
	}
	
	@Test
	public void shouldThrowRuntimeWhenAddressIsNull() {
		ContactService contact = new ContactService();
		Assertions.assertThrows(RuntimeException.class, ()-> {contact.addContact("7", "John", "Doe", "1234567890", null);}
		);
	}
	

	@Test
	public void shouldThrowRuntimeWhenContactIDIsNull() {
		ContactService contact = new ContactService();
		Assertions.assertThrows(RuntimeException.class, ()-> {contact.addContact(null, "John", "Doe", "1234567890", "123 Address");}
		);
	}
	
	@Test
	public void shouldThrowRuntimeWhenContactIDIsGreaterThanTen() {
		ContactService contact = new ContactService();
		Assertions.assertThrows(RuntimeException.class, ()-> {contact.addContact("00000000001", "John", "Doe", "1234567890", "Address");}
		);
	}
	
	@Test
	public void shouldThrowRuntimeWhenContactIDIsNotUnique() {
		ContactService contact = new ContactService();
		contact.addContact("8", "Joe", "Denver", "1234567890", "Address");
		Assertions.assertThrows(RuntimeException.class, ()-> {contact.addContact("8", "Joe", "Denver", "1234567890", "Address");}
		);
	}
}