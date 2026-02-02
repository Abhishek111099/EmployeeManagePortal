package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.LeaveApplication;
import com.example.demo.Entity.LeaveBalance;
import com.example.demo.Repo.LeaveApplicationRepo;
import com.example.demo.Repo.LeaveBalanceRepo;

@Service
public class LeaveBalanceService {

    private final LeaveBalanceRepo leaveBalanceRepository;

    public LeaveBalanceService(LeaveBalanceRepo leaveBalanceRepository) {
        this.leaveBalanceRepository = leaveBalanceRepository;
    }

    public List<LeaveBalance> getAllBalances() {
        return leaveBalanceRepository.findAll();
    }

    public List<LeaveBalance> getBalancesByEmployee(Long employeeId) {
        return leaveBalanceRepository.findByEmployeeId(employeeId);
    }

    public LeaveBalance createOrUpdateBalance(LeaveBalance balance) {
        balance.setRemainingDays(balance.getTotalDays() - balance.getUsedDays());
        return leaveBalanceRepository.save(balance);

    }

    public void deleteBalance(Long id) {
        leaveBalanceRepository.deleteById(id);
    }
}