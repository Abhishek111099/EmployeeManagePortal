package com.example.demo.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String contactNumber; // string
    private String address;
    private String designation;
    private String skills;
    private Integer experience; // changed from int -> Integer

    @OneToMany(mappedBy = "employee")
    private List<LeaveBalance> leaveBalances;

    @OneToMany(mappedBy = "employee")
    private List<LeaveApplication> leaveApplications;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public List<LeaveBalance> getLeaveBalances() {
		return leaveBalances;
	}

	public void setLeaveBalances(List<LeaveBalance> leaveBalances) {
		this.leaveBalances = leaveBalances;
	}

	public List<LeaveApplication> getLeaveApplications() {
		return leaveApplications;
	}

	public void setLeaveApplications(List<LeaveApplication> leaveApplications) {
		this.leaveApplications = leaveApplications;
	}

	public Employee(Long id, String name, String contactNumber, String address, String designation, String skills,
			Integer experience, List<LeaveBalance> leaveBalances, List<LeaveApplication> leaveApplications) {
		super();
		this.id = id;
		this.name = name;
		this.contactNumber = contactNumber;
		this.address = address;
		this.designation = designation;
		this.skills = skills;
		this.experience = experience;
		this.leaveBalances = leaveBalances;
		this.leaveApplications = leaveApplications;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
    
	
	
}
