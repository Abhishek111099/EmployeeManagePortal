package com.example.demo.DTO;

public class EmployeeReponse {

    private Long id;
    private String name;
    private String contactNumber;
    private String skills;
    private Integer experience;
    private String designation;
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
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
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
	public EmployeeReponse(Long id, String name, String contactNumber, String skills, int experience,
			String designation) {
		super();
		this.id = id;
		this.name = name;
		this.contactNumber = contactNumber;
		this.skills = skills;
		this.experience = experience;
		this.designation = designation;
	}
	
	
	public EmployeeReponse() {
		super();
		// TODO Auto-generated constructor stub
	}




}
