package com.example.demo.DTO;

import java.time.LocalDate;

public class LeaveResponse {

	  private Long id;
	    private String leaveType;
	    private LocalDate fromDate;
	    private LocalDate toDate;
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
		public LeaveResponse(Long id, String leaveType, LocalDate fromDate, LocalDate toDate) {
			super();
			this.id = id;
			this.leaveType = leaveType;
			this.fromDate = fromDate;
			this.toDate = toDate;
		}
		public LeaveResponse() {
			super();
			// TODO Auto-generated constructor stub
		}



}
