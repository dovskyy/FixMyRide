package com.dovskyy.fixmyride.service;

import com.dovskyy.fixmyride.dto.EmployeeDTO;
import com.dovskyy.fixmyride.mapper.EmployeeMapper;
import com.dovskyy.fixmyride.model.Employee;
import com.dovskyy.fixmyride.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeService(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }

    public EmployeeDTO getById(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()) {
            return employeeMapper.toDTO(employee.get());
        } else {
            throw new RuntimeException("Employee not found (id = " + id + ")");
        }
    }

    public List<EmployeeDTO> getAll() {
        List<Employee> employees = employeeRepository.findAll();
        return employeeMapper.toDTO(employees);
    }

    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = employeeMapper.toEntity(employeeDTO);
        return employeeMapper.toDTO(employeeRepository.save(employee));
    }

    public List<EmployeeDTO> getAllEmployees() {
        return employeeMapper.toDTO(employeeRepository.findAll());
    }

    public EmployeeDTO updateEmployee(Long id, EmployeeDTO employeeDTO) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if(employeeOptional.isPresent()) {
            Employee employee = employeeOptional.get();
            employeeMapper.updateEmployeeFromDTO(employeeDTO, employee);
            employee.setId(id); // Ensure the ID is set correctly
            return employeeMapper.toDTO(employeeRepository.save(employee));
        } else {
            throw new RuntimeException("Employee not found (id = " + id + ")");
        }
    }
}
