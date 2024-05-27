package com.dovskyy.fixmyride.controllers;

import com.dovskyy.fixmyride.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    public EmployeeController(EmployeeService employeeService) {
    }

    @GetMapping(value = "/{id}")
    public void getEmployeeById() {
    }

}
