package com.example.tests;

public class ContactData {
	public String firstname;
	public String lastname;
	public String address;
	public String homephone;
	public String mobilephone;
	public String workphone;
	public String email;
	public String email2;
	public String birthday;
	public String birthmonth;
	public String birthyear;
	public String group;
	public String address2;
	public String homephone2;

	public ContactData() {
		
	}

	public ContactData(String firstname, String lastname, String address,
			String homephone, String mobilephone, String workphone,
			String email, String email2, String birthday, String birthmonth,
			String birthyear, String group, String address2, String homephone2) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.homephone = homephone;
		this.mobilephone = mobilephone;
		this.workphone = workphone;
		this.email = email;
		this.email2 = email2;
		this.birthday = birthday;
		this.birthmonth = birthmonth;
		this.birthyear = birthyear;
		this.group = group;
		this.address2 = address2;
		this.homephone2 = homephone2;
	}

}