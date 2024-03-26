package com.mvc2.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.validation.valueextraction.ExtractedValue;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.NumberFormat;

public class Customer {
	@NotEmpty(message = " value required!!!")
	@Pattern(regexp = "[a-zA-Z]+", message = " value must be word!!!")
	private String firstName;

	@NotEmpty(message = " value required!!!")
	@Pattern(regexp = "[a-zA-Z]+", message = " value must be word!!!")
	private String lastName;

	// @Pattern(regexp = "[0-9]{3}", message = " value must be number!!!")
	@NotNull(message = " value required!!!")
	@Range(min = 1, max = 100, message = " value length maximun 3 required!!!")
	private int age;

	@NotEmpty(message = " value required!!!")
	private String address;

	@NotNull(message = " value required!!!")
	@Pattern(regexp = "[0-9]+", message = " value must be number required!!!")
	@Size(min = 10, max = 10, message = " value length must be 10 !!!")
	private String phoneNo;

	@NotEmpty(message = " value required!!!")
	@Email(message = " value format wrong!!!")
	private String email;

	public Customer() {
		super();
	}

	public Customer(String firstName, String lastName, int age, String address, String phoneNo, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ ", phoneNo=" + phoneNo + ", email=" + email + "]";
	}

}
