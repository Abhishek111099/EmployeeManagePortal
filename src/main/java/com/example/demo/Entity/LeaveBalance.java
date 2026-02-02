package com.example.demo.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "leave_balance")
public class LeaveBalance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String leaveType; 
    private Integer totalDays;
    private Integer usedDays;
    private Integer remainingDays;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public int getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}

	public int getUsedDays() {
		return usedDays;
	}

	public void setUsedDays(int usedDays) {
		this.usedDays = usedDays;
	}

	public int getRemainingDays() {
		return remainingDays;
	}

	public void setRemainingDays(int remainingDays) {
		this.remainingDays = remainingDays;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public LeaveBalance(Long id, String leaveType, int totalDays, int usedDays, int remainingDays, Employee employee) {
		super();
		this.id = id;
		this.leaveType = leaveType;
		this.totalDays = totalDays;
		this.usedDays = usedDays;
		this.remainingDays = remainingDays;
		this.employee = employee;
	}

	public LeaveBalance() {
		super();
		// TODO Auto-generated constructor stub
	}

  
    
    
    
    
    
}

