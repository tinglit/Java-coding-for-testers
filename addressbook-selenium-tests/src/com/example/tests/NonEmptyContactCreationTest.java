package com.example.tests;


import org.testng.annotations.Test;

public class NonEmptyContactCreationTest extends TestBase {
	
  @Test
  public void testNonEmptyContactCreation() throws Exception {
    openMainPage();
    initContactCreation();
    ContactData contact = new ContactData();
    contact.firstname="firstname 1";
    contact.lastname="lastname 1";
    contact.address="address 1";
    contact.homephone="1234567";
    contact.mobilephone="79211234567";
    contact.workphone="9876543";
    contact.email="email@1";
    contact.email2="email@2";
    contact.birthday="1";
    contact.birthmonth="January";
    contact.birthyear="1901";
    contact.group="group 1";
    contact.address2="address 2";
    contact.homephone2="8901234";
	fillContactForm(contact);
    submitContactCreation();
    returnToMainPage();
  }
  
}
