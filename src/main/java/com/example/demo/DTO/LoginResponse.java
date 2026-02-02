package com.example.demo.DTO;

public class LoginResponse {

	    private Long userId;
	    private String role;
	    private Long employeeId;
		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public Long getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(Long employeeId) {
			this.employeeId = employeeId;
		}
		
		
		public LoginResponse(Long userId, String role, Long employeeId) {
			super();
			this.userId = userId;
			this.role = role;
			this.employeeId = employeeId;
		}
		
		
		public LoginResponse() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
	    
	}

