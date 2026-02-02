package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.LeaveApplication;
import com.example.demo.Service.LeaveApplicationService;

@RestController
@RequestMapping("/leave-applications")
public class LeaveApplicationController {

    private final LeaveApplicationService leaveApplicationService;

    public LeaveApplicationController(LeaveApplicationService leaveApplicationService) {
        this.leaveApplicationService = leaveApplicationService;
    }

    // GET all leave applications (Admin)
    @GetMapping
    public List<LeaveApplication> getAllApplications() {
        return leaveApplicationService.getAllApplications();
    }

    // GET applications for specific employee
    @GetMapping("/employee/{employeeId}")
    public List<LeaveApplication> getApplicationsByEmployee(@PathVariable Long employeeId) {
        return leaveApplicationService.getApplicationsByEmployee(employeeId);
    }

    // POST leave application (Employee)
    @PostMapping
    public LeaveApplication createApplication(@RequestBody LeaveApplication application) {
        return leaveApplicationService.createApplication(application);
    }

    // UPDATE leave application status (Admin)
    @PutMapping("/{id}/status")
    public LeaveApplication updateStatus(@PathVariable Long id, @RequestParam String status) {
        return leaveApplicationService.updateApplicationStatus(id, status);
    }

    // DELETE leave application (Admin)
    @DeleteMapping("/{id}")
    public void deleteApplication(@PathVariable Long id) {
        leaveApplicationService.deleteApplication(id);
    }
}