package com.example.demo.DTO;

public class EmployeeRequest {

    private String name;
    private String contactNumber;
    private String address;
    private String skills;
    private Integer experience;
    private String designation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public EmployeeRequest(String name, String contactNumber, String address, String skills, int experience,
			String designation) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.address = address;
		this.skills = skills;
		this.experience = experience;
		this.designation = designation;
	}
	public EmployeeRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    
}
