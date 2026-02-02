package com.example.demo.DTO;

public class LeaveBalance {

	
	 private String leaveType;
	    private int totalDays;
	    private int usedDays;
	    private int remainingDays;
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
		
		public LeaveBalance(String leaveType, int totalDays, int usedDays, int remainingDays) {
			super();
			this.leaveType = leaveType;
			this.totalDays = totalDays;
			this.usedDays = usedDays;
			this.remainingDays = remainingDays;
		}
		public LeaveBalance() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
		
	    
}
