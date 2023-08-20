package contact;

import java.util.ArrayList;

public class ContactService {
	//array list for contacts
	private final ArrayList<Contact> contacts;
	
	public ContactService() {
		//initialize array
		contacts = new ArrayList<>();
	}
	
	//Method to add contact
	public boolean addContact(Contact contact) {
		boolean isInArray = false;
		//loop to check if contact is in array
		for (Contact contactObject: contacts) {
			if (contactObject.equals(contact)) {
				isInArray = true;
				break;
			}
		}
		
		if (!isInArray) {
			contacts.add(contact);
			return true;
		}
		return false;
	}
	
	//find contact by id
	public Contact getContact(String id) {
		for (Contact contactObject: contacts) {
			if (contactObject.getID().equals(id)) {
				return contactObject;
			}
		}
		return null;
	}
	
	//delete contact by id
	public boolean deleteContact(String id) {
		Contact contact = getContact(id);
		if (contact != null) {
			contacts.remove(contact);
			return true;
		}
		return false;
	}
}
	
	