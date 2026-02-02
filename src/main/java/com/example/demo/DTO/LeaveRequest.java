package com.example.demo.DTO;

import java.time.LocalDate;

public class LeaveRequest {

	    private String leaveType;
	    private LocalDate fromDate;
	    private LocalDate toDate;
	    private String reason;
		public String getLeaveType() {
			return leaveType;
		}
		public void setLeaveType(String leaveType) {
			this.leaveType = leaveType;
		}
		public LocalDate getFromDate() {
			return fromDate;
		}
		public void setFromDate(LocalDate fromDate) {
			this.fromDate = fromDate;
		}
		public LocalDate getToDate() {
			return toDate;
		}
		public void setToDate(LocalDate toDate) {
			this.toDate = toDate;
		}
		public String getReason() {
			return reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}
		
		
		public LeaveRequest(String leaveType, LocalDate fromDate, LocalDate toDate, String reason) {
			super();
			this.leaveType = leaveType;
			this.fromDate = fromDate;
			this.toDate = toDate;
			this.reason = reason;
		}
		
		public LeaveRequest() {
			super();
			// TODO Auto-generated constructor stub
		}
	
	    
		
		


}


