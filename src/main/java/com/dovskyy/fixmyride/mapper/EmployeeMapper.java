package com.dovskyy.fixmyride.mapper;

import com.dovskyy.fixmyride.dto.EmployeeDTO;
import com.dovskyy.fixmyride.model.Employee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeDTO toDTO(Employee employee);
    Employee toEntity(EmployeeDTO employeeDTO);
    List<EmployeeDTO> toDTO(List<Employee> employees);

}
