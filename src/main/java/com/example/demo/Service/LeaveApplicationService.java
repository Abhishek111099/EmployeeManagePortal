package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.LeaveApplication;
import com.example.demo.Repo.LeaveApplicationRepo;

@Service
public class LeaveApplicationService {

    private final LeaveApplicationRepo leaveApplicationRepository;

    public LeaveApplicationService(LeaveApplicationRepo leaveApplicationRepository) {
        this.leaveApplicationRepository = leaveApplicationRepository;
    }

    public List<LeaveApplication> getAllApplications() {
        return leaveApplicationRepository.findAll();
    }

    public List<LeaveApplication> getApplicationsByEmployee(Long employeeId) {
        return leaveApplicationRepository.findByEmployeeId(employeeId);
    }

    public LeaveApplication createApplication(LeaveApplication application) {
        application.setStatus("PENDING");
        return leaveApplicationRepository.save(application);
    }

    public LeaveApplication updateApplicationStatus(Long id, String status) {
        return leaveApplicationRepository.findById(id).map(app -> {
            app.setStatus(status);
            return leaveApplicationRepository.save(app);
        }).orElseThrow(() -> new RuntimeException("Application not found"));
    }

    public void deleteApplication(Long id) {
        leaveApplicationRepository.deleteById(id);
    }
}