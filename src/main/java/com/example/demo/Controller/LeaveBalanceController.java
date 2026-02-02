package com.example.demo.Controller;


import com.example.demo.Entity.LeaveBalance;
import com.example.demo.Service.LeaveBalanceService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leave-balances")
public class LeaveBalanceController {

    private final LeaveBalanceService leaveBalanceService;

    public LeaveBalanceController(LeaveBalanceService leaveBalanceService) {
        this.leaveBalanceService = leaveBalanceService;
    }

    // GET all balances (Admin)
    @GetMapping
    public List<LeaveBalance> getAllBalances() {
        return leaveBalanceService.getAllBalances();
    }

    // GET balances for specific employee
    @GetMapping("/employee/{employeeId}")
    public List<LeaveBalance> getEmployeeBalances(@PathVariable Long employeeId) {
        return leaveBalanceService.getBalancesByEmployee(employeeId);
    }

    // POST or UPDATE leave balance (Admin)
    @PostMapping
    public LeaveBalance createOrUpdateBalance(@RequestBody LeaveBalance balance) {
        return leaveBalanceService.createOrUpdateBalance(balance);
    }

    // DELETE leave balance
    @DeleteMapping("/{id}")
    public void deleteBalance(@PathVariable Long id) {
        leaveBalanceService.deleteBalance(id);
    }
}

