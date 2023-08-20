package test;

import contact.Contact;
import org.junit.jupiter.api.Test;

public class ContactTest {
	static final String firstName = "Lance";
	static final String lastName = "Heatwole";
	static final String phone = "0123456789";
	static final String address = "Independence, MO";
	
	@Test
	void testContactClass() {
		Contact contactClass = new Contact(firstName, lastName, phone, address);
		assert (contactClass.getFirstName().equals(firstName));
		assert (contactClass.getLastName().equals(lastName));
		assert (contactClass.getPhone().equals(phone));
		assert (contactClass.getAddress().equals(address));
	}
}
