import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactServiceTest {

	@Test
	public void testAdd() {
		ContactService cs = new ContactService();
		//sets contact list to test below
		Contact c1 = new Contact ("11001", "Bill", "Clinton", "1600 Pennsylvania Ave", "6034405522");
		Contact c2 = new Contact ("12002", "Jim", "Halpert", "1725 Slough Ave", "6034589760");
		Contact c3 = new Contact ("13003", "Bob", "Vance", "26 Lawson St", "6037227777");
		
		//shows the test work when adding contacts to list
		assertEquals(true, cs.newContact(c1));
		assertEquals(true, cs.newContact(c2));
		assertEquals(true, cs.newContact(c3));
		
		//shows the test does not work when trying to add existing contact to list
		assertEquals(false, cs.newContact(c3));
	}
	
	@Test
	public void testDelete() {
		ContactService cs = new ContactService();
		//sets contact list to test below and adds to list
		Contact c1 = new Contact ("1111", "Bill", "Clinton", "1600 Pennsylvania Ave", "6034405522");
		Contact c2 = new Contact ("2222", "Jim", "Halpert", "1725 Slough Ave", "6034589760");
		Contact c3 = new Contact ("3333", "Bob", "Vance", "26 Lawson St", "6037227777");
		assertEquals(true, cs.newContact(c1));
		assertEquals(true, cs.newContact(c2));
		assertEquals(true, cs.newContact(c3));
		
		//shows the test work when trying to remove contact given contactID
		assertEquals(true, cs.removeContact("1111"));
		assertEquals(true, cs.removeContact("2222"));
		
		//shows the test does not work when trying to remove contact given incorrect contactID
		assertEquals(false, cs.removeContact("4444"));
		
	}
	
	@Test
	public void testUpdate() {
		ContactService cs = new ContactService();
		//sets contact list to test below
		Contact c1 = new Contact ("22001", "Bill", "Clinton", "1600 Pennsylvania Ave", "6034405522");
		Contact c2 = new Contact ("33002", "Jim", "Halpert", "1725 Slough Ave", "6034589760");
		Contact c3 = new Contact ("44003", "Bob", "Vance", "26 Lawson St", "6037227777");
		assertEquals(true, cs.newContact(c1));
		assertEquals(true, cs.newContact(c2));
		assertEquals(true, cs.newContact(c3));
		
		//shows the test work when trying to update existing contact
		assertEquals(true, cs.updateContact("22001", "John", "Lennon", "1 West 72nd St", "7224506709"));
		assertEquals(true, cs.updateContact("33002", "Ringo", "Starr", "225 Record Ave", "7228889999"));
		
		//shows that the test works when you try to update with an incorrect contactID
		assertEquals(false, cs.updateContact("55004", "Ringo", "Starr", "225 Record Ave", "7223456789"));
	}

}
