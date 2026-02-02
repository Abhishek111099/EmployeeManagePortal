package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.EmployeeReponse;
import com.example.demo.DTO.EmployeeRequest;
import com.example.demo.Service.EmployeeService;

@RestController
@RequestMapping("/admin/employees")
@CrossOrigin(origins = "http://localhost:4200")
	public class AdminController {
	    @Autowired
	    private EmployeeService employeeService;

	    @PostMapping("/addEmp")
	    public EmployeeReponse addEmployee(@RequestBody EmployeeRequest request) {
	        return employeeService.addEmployee(request);
	    }
	    
	    @GetMapping
	    public List<EmployeeReponse> getEmployees() {
	        return employeeService.getAllEmployees();
	    }

	    @PutMapping("/{id}")
	    public EmployeeReponse updateEmployee(
	            @PathVariable Long id,
	            @RequestBody EmployeeRequest request) {
	        return employeeService.updateEmployee(id, request);
	    }

	    @DeleteMapping("/{id}")
	    public String deleteEmployee(@PathVariable Long id) {
	        employeeService.deleteEmployee(id);
	        return "Employee deleted successfully";
	    }
	

}
