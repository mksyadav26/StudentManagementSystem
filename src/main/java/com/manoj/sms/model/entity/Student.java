package com.manoj.sms.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	@NotEmpty
	@Size(min=2, message ="First Name should have  atleast 2 character")
	private String first_Name;
	private String last_Name;
	@Email(message ="Email should not be in proper format like abc@example.com")
	private String email;
	private int fees;
	private int balance;
	@NotEmpty(message ="Subject should not be empty")
	private String subject;
	@NotEmpty(message ="Standard should not be empty")
	private String standard;
	public Long getId() {
		return id;
	}
	public Student() {
		super();
	}
	public Student(String first_Name, String last_Name, String email, int fees, int balance, String subject,
			String standard) {
		super();
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.email = email;
		this.fees = fees;
		this.balance = balance;
		this.subject = subject;
		this.standard = standard;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	
	}
	

