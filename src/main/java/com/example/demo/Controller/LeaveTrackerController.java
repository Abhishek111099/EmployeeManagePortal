package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.LeaveBalance;
import com.example.demo.Service.LeaveBalanceService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/leave-tracker")
public class LeaveTrackerController {

    private final LeaveBalanceService leaveBalanceService;

    public LeaveTrackerController(LeaveBalanceService leaveBalanceService) {
        this.leaveBalanceService = leaveBalanceService;
    }

    @GetMapping("/employee/{employeeId}")
    public List<LeaveBalance> getLeaveTracker(@PathVariable Long employeeId) {
        return leaveBalanceService.getLeaveTracker(employeeId);
    }
}
