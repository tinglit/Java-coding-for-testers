package com.example.tests;


import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
	
  @Test
  public void testNonEmptyContactCreation() throws Exception {
    app.getNavigationHelper().openMainPage();
    app.getContactHelper().initContactCreation();
    ContactData contact = new ContactData();
    contact.firstname="Ekaterina";
    contact.lastname="Popova";
    contact.address="Savushkina";
    contact.homephone="1234567";
    contact.mobilephone="79211234567";
    contact.workphone="9876543";
    contact.email="email1@popova.ru";
    contact.email2="email2@popova.ru";
    contact.birthday="1";
    contact.birthmonth="January";
    contact.birthyear="1901";
    contact.group="group 1";
    contact.address2="address 2";
    contact.homephone2="8901234";
	app.getContactHelper().fillContactForm(contact);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToMainPage();
  }
  
  @Test
  public void testEmptyContactCreation() throws Exception {
    app.getNavigationHelper().openMainPage();
    app.getContactHelper().initContactCreation();
	app.getContactHelper().fillContactForm(new ContactData("", "", "", "", "", "", "", "", "-", "-", "", "[none]", "", ""));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToMainPage();
  }
  
  
  
}
