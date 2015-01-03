package com.example.tests;


import org.testng.annotations.Test;

public class EmptyContactCreationTest extends TestBase {
  
  @Test
  public void testEmptyContactCreation() throws Exception {
    openMainPage();
    initContactCreation();
	fillContactForm(new ContactData("", "", "", "", "", "", "", "", "-", "-", "", "[none]", "", ""));
    submitContactCreation();
    returnToMainPage();
  }
  
  
}
