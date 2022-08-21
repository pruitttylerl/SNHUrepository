import java.util.ArrayList;

public class ContactService {
	//contains list of contacts
	private ArrayList<Contact> contactsList;
	
	//default constructor
	public ContactService()
	{
		contactsList = new ArrayList<>();
	}
	
	//adds contact to list if not already there
	public boolean newContact(Contact contact)
	{
		//sets boolean value to false to start
		boolean contactCheck = false;
		//loop to go through contact list
		for (Contact con: contactsList)
		{
			//if contact matches one in list
			if(con.equals(contact))
			{
				contactCheck = true;
			}
		}
		
		//if contact check is false
		if (!contactCheck)
		{
			//adds contact to list and prints message about new contact
			contactsList.add(contact);
			System.out.println("Added new contact");
			return true;
		} else {//if contact check is true
			//returns false and prints message saying its already in list, that contact couldnt be added
			System.out.println("Contact already in list");
			return false;
		}
	}
	
	//this removes a contact if another with the same contactID is already in list
	public boolean removeContact(String contactID)
	{
		//loop to  go through contact list
		for(Contact con: contactsList)
		{
			//checks if given contactID matches on in list
			if (con.getContactID().equals(contactID))
			{
				//removes contact and displays message once it has confirmed it matches one in list
				contactsList.remove(con);
				System.out.println("Removed duplicate contact");
				return true;
			}
		}
		//if not duplicates are found, returns false and sends message
		System.out.println("No duplicate contactIDs");
		return false;
	}
	
	//this updates contact baed on contactID
	//updates first and last name and number address
	//if not, pass an empty string
	//takes in contactID, first and last name, and number address
	public boolean updateContact(String contactID, String firstName, String lastName, String numberAddress, String phoneNumber)
	{
		//loop to go through contact list
		for (Contact con : contactsList)
		{
			//checks if contactID matches one in list, if it does goes through and sets rest of details
			if (con.getContactID().equals(contactID))
			{
				//if details has a value, sets it to contactID given
				if (!firstName.equals(""))
				{
					con.setFirstName(firstName);
				}
				if (!lastName.equals(""))
				{
					con.setLastName(lastName);
				}
				if (!numberAddress.equals(""))
				{
					con.setNumberAddress(numberAddress);
				}
				if (!phoneNumber.equals(""))
				{
					con.setPhoneNumber(phoneNumber);
				}
				//sends message saying contact has been updated
				System.out.println("Updated contact");
				return true;	
			}
		}
		//if contactID does not match one in list, will return false and error message saying:
		System.out.println("Contact not in list");
		return false;
	}
	
}
