package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.EmployeeReponse;
import com.example.demo.DTO.EmployeeRequest;
import com.example.demo.Entity.Employee;
import com.example.demo.Repo.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    
    //Create New Employee
    public EmployeeReponse addEmployee(EmployeeRequest request) {

        Employee employee = new Employee();
        employee.setName(request.getName());
        employee.setContactNumber(request.getContactNumber());
        employee.setAddress(request.getAddress());
        employee.setSkills(request.getSkills());
        employee.setExperience(request.getExperience());
        employee.setDesignation(request.getDesignation());

        Employee saved = repository.save(employee);
        
        EmployeeReponse response = new EmployeeReponse();
        response.setId(saved.getId());
        response.setName(saved.getName());
        response.setContactNumber(saved.getContactNumber());
        response.setSkills(saved.getSkills());
        response.setExperience(saved.getExperience());
        response.setDesignation(saved.getDesignation());

        return response;
    }
    
 // GET ALL EMPLOYEES
    public List<EmployeeReponse> getAllEmployees() {
        List<Employee> employees = repository.findAll(); 
        List<EmployeeReponse> responses = new ArrayList<>(); 

        for (Employee emp : employees) {
            EmployeeReponse res = new EmployeeReponse();
            res.setId(emp.getId());
            res.setName(emp.getName());
            res.setContactNumber(emp.getContactNumber());
            res.setSkills(emp.getSkills());
            res.setExperience(emp.getExperience());
            res.setDesignation(emp.getDesignation());
            responses.add(res);
        }

        return responses;
    }
    
    
    // update
    public EmployeeReponse updateEmployee(Long id, EmployeeRequest request) {

        Employee employee = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        employee.setName(request.getName());
        employee.setContactNumber(request.getContactNumber());
        employee.setAddress(request.getAddress());
        employee.setSkills(request.getSkills());
        employee.setExperience(request.getExperience());
        employee.setDesignation(request.getDesignation());

        Employee updated = repository.save(employee);

        EmployeeReponse response = new EmployeeReponse();
        response.setId(updated.getId());
        response.setName(updated.getName());
        response.setContactNumber(updated.getContactNumber());
        response.setSkills(updated.getSkills());
        response.setExperience(updated.getExperience());
        response.setDesignation(updated.getDesignation());

        return response;
    }

    //delete
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}
