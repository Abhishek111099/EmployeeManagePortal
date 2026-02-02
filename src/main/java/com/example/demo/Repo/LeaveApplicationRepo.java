package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.LeaveApplication;

public interface LeaveApplicationRepo extends JpaRepository<LeaveApplication, Long> {

       List<LeaveApplication> findByEmployeeId(Long employeeId);

}