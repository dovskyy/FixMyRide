package com.dovskyy.fixmyride.controllers;

import com.dovskyy.fixmyride.dto.EmployeeDTO;
import com.dovskyy.fixmyride.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable Long id) {
        return employeeService.getById(id);
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public ResponseEntity createEmployee(@RequestBody EmployeeDTO employeeDTO) throws URISyntaxException {
       EmployeeDTO createdEmployee = employeeService.createEmployee(employeeDTO);
       return ResponseEntity.created(new URI("/employee/" + createdEmployee.getId()))
               .body(createdEmployee);
    }
}
