import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactTest {
	//declaring variables
  private String contactIdTest;
  private String firstNameTest;
  private String lastNameTest;
  private String phoneNumberTest;
  private String numberAddressTest;
  private String tooBigContactId;
  private String tooBigFirstName;
  private String tooBigLastName;
  private String tooBigPhoneNumber;
  private String tooSmallPhoneNumber;
  private String tooBigNumberAddress;

  @BeforeEach
  void setUp() {
	//assigning values to variables
    contactIdTest = "111122256";
    firstNameTest = "Kurt";
    lastNameTest = "Cobain";
    phoneNumberTest = "6034567890";
    numberAddressTest = "171 Lake Washington Blvd";
    tooBigContactId = "567890456789345677";
    tooBigFirstName = "John Michael";
    tooBigLastName = "Frankenstein";
    tooBigPhoneNumber = "603555667788";
    tooSmallPhoneNumber = "603456";
    tooBigNumberAddress = "171 Lake Washington Boulevard Seattle, Washington";
  }

  //doesnt return null value
  @Test
  void contactTest() {
    Contact contact = new Contact(contactIdTest, tooBigFirstName, lastNameTest, numberAddressTest, phoneNumberTest);
    assertNotNull(contact);
  }
  
  //all tests below are the same
  //ensures that it throws exceptions when given a null value or too big/small of a value
  //ensures that values equal expected when given proper input
  @Test
  void updateFirstNameTest() {
    Contact contact = new Contact(contactIdTest, tooBigFirstName, lastNameTest, numberAddressTest, phoneNumberTest);
    contact.setFirstName(firstNameTest);
    assertThrows(IllegalArgumentException.class,
                            () -> contact.setFirstName(null));
    assertThrows(IllegalArgumentException.class,
                            () -> contact.setFirstName(tooBigFirstName));
    assertEquals(firstNameTest, contact.getFirstName());
  }
  @Test
  void updateContactIDTest() {
    Contact contact = new Contact(contactIdTest, tooBigFirstName, lastNameTest, numberAddressTest, phoneNumberTest);
    contact.setContactID(contactIdTest);
    assertThrows(IllegalArgumentException.class,
                            () -> contact.setContactID(null));
    assertThrows(IllegalArgumentException.class,
                            () -> contact.setContactID(tooBigContactId));
  }
  @Test
  void updateLastNameTest() {
    Contact contact = new Contact(contactIdTest, tooBigFirstName, lastNameTest, numberAddressTest, phoneNumberTest);
    contact.setLastName(lastNameTest);
    assertThrows(IllegalArgumentException.class,
                            () -> contact.setLastName(null));
    assertThrows(IllegalArgumentException.class,
                            () -> contact.setFirstName(tooBigLastName));
    assertEquals(lastNameTest, contact.getLastName());
  }
  @Test
  void updateNumberAddressTest() {
    Contact contact = new Contact(contactIdTest, tooBigFirstName, lastNameTest, numberAddressTest, phoneNumberTest);
    contact.setNumberAddress(numberAddressTest);
    assertThrows(IllegalArgumentException.class,
                            () -> contact.setNumberAddress(null));
    assertThrows(IllegalArgumentException.class,
                            () -> contact.setNumberAddress(tooBigNumberAddress));
    assertEquals(numberAddressTest, contact.getNumberAddress());
  }
  @Test
  void updatePhoneNumberTest() {
    Contact contact = new Contact(contactIdTest, tooBigFirstName, lastNameTest, numberAddressTest, phoneNumberTest);
    contact.setPhoneNumber(phoneNumberTest);
    assertThrows(IllegalArgumentException.class,
                            () -> contact.setPhoneNumber(null));
    assertThrows(IllegalArgumentException.class,
                            () -> contact.setPhoneNumber(tooBigPhoneNumber));
    assertThrows(IllegalArgumentException.class,
            () -> contact.setPhoneNumber(tooSmallPhoneNumber));
    assertEquals(phoneNumberTest, contact.getPhoneNumber());
  }
  
}
 