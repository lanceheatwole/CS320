package contact;

import java.util.UUID;

public class Contact {
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	private String id;
	
	private static final int LENGTH = 10;
	private static final byte ADDRESS_LENGTH = 30;
	
	//initializer for contact class
	public Contact(String firstName, String lastName, String phone, String address) {
		setUniqueId();
		setFirstName(firstName);
		setLastName(lastName);
		setPhone(phone);
		setAddress(address);
	}
	
	//getter methods 
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
	
	public String getID() {
		return id;
	}
	
	//setter methods and validation for entries
	protected void setFirstName(String firstName) {
		if(firstName == null) {
			throw new IllegalArgumentException("First name cannot be blank");
		}
		else if (firstName.length() > LENGTH) {
			throw new IllegalArgumentException("First name cannot exceed " + LENGTH + " characters");
		}
		this.firstName = firstName;
	}
	
	protected void setLastName(String lastName) {
		if(lastName == null) {
			throw new IllegalArgumentException("Last name cannot be blank");
		}
		else if (lastName.length() > LENGTH) {
			throw new IllegalArgumentException("Last name cannot exceed " + LENGTH + " characters");
		}
		this.lastName = lastName;
	}
	
	protected void setPhone(String phone) {
		String digits = "[\\d]+"; //digits only validation
		if (!phone.matches(digits)) { //checks number is only digits
			throw new IllegalArgumentException("Enter valid phone number");
		}
		if (phone.length() != LENGTH) {
			throw new IllegalArgumentException("Phone number must be 10 digits");
		}
		this.phone = phone;
	}
	
	protected void setAddress(String address) {
		if (address == null) {
			throw new IllegalArgumentException("Address cannot be empty");
		}
		else if (address.length() > ADDRESS_LENGTH) {
			throw new IllegalArgumentException("Address cannot be longer than " + ADDRESS_LENGTH + " characters");
		}
		this.address = address;
	}
	
	protected void setUniqueId() {
		String uuid = UUID.randomUUID().toString();
		this.id = uuid.substring(uuid.length() - 16);
	}
}
