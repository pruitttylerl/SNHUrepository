
public class Contact {
	//variable declarations
	private String firstName;
	private String lastName;
	private String numberAddress;
	private String contactID;
	private String phoneNumber;
	
	//default constructor
	public Contact(String contactID, String firstName, String lastName, String numberAddress, String phoneNumber)
	{
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.numberAddress = numberAddress;
		this.phoneNumber = phoneNumber;
	}
	
	//getters
	public String getContactID()
	{
		return contactID;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getNumberAddress()
	{
		return numberAddress;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	//setters
	public void setFirstName(String firstName)
	{
		//checks to make sure first name is not null
		if (firstName == null) {
			throw new IllegalArgumentException("First name cannot be null");
			//ensures first name is 10 or less characters
		    } else if (firstName.length() > 10) {
		    	throw new IllegalArgumentException("First name cannot be greater than " +
                        10 + " characters");
		    } else {
		    	this.firstName = firstName;
		    }
	}
	public void setLastName(String lastName)
	{
		//confirms last name is not null
		if (lastName == null) {
			throw new IllegalArgumentException("Last name cannot be null");
			//checks that last name is 10 or less characters
		    } else if (lastName.length() > 10) {
		    	throw new IllegalArgumentException("Last name cannot be greater than " +
                        10 + " characters");
		    } else {
		    	this.lastName = lastName;
		    }
	}
	public void setNumberAddress(String numberAddress)
	{
		//checks to make sure address is not null
		if (numberAddress == null) {
			throw new IllegalArgumentException("Address cannot be null");
			//ensures the address character length does not exceed 30
		    } else if (numberAddress.length() >= 30) {
		    	throw new IllegalArgumentException("Address cannot be longer than " +
                        10 + " characters");
		    } else {
		    	this.numberAddress = numberAddress;
		    }
	}
	public void setContactID(String contactID)
	{
		//checks to make sure contactID is not null
		if (contactID == null) {
			throw new IllegalArgumentException("Contact ID cannot be null");
			//confirms length cannot exceed 10
		    } else if (contactID.length() >= 10) {
		    	throw new IllegalArgumentException("Contact ID cannot be greater than " +
                        10 + " characters");
		    } else {
		    	this.contactID = numberAddress;
		    }
	}
	public void setPhoneNumber(String phoneNumber)
	{
		//defines numbers valid
		String regex = "[0-9]+";
		//checks to make sure phone number is exactly 10 digits before setting it
	    if (phoneNumber == null) {
	      throw new IllegalArgumentException("Phone number cannot be null.");
	      //checking length of phone number here, must match 10
	    } else if (phoneNumber.length() != 10) {
	      throw new IllegalArgumentException(
	          "Phone number length invalid. Make sure it is " +
	          10 + " digits.");
	      //confirms all digits are numbers, no letters
	    } else if (!phoneNumber.matches(regex)) {
	      throw new IllegalArgumentException(
	          "Phone number must only be numbers");
	    } else {
	      this.phoneNumber = phoneNumber;
	    }
	}
	
}