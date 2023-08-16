package com.example.college.dto;

public class Student {
	
	
	
	private Long id;

    private String name;
    private String emailId;
    private String phoneNumber;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Student(Long id, String name, String emailId, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    
}
