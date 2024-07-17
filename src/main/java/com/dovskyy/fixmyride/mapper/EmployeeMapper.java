package com.dovskyy.fixmyride.mapper;

import com.dovskyy.fixmyride.dto.EmployeeDTO;
import com.dovskyy.fixmyride.model.Employee;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeDTO toDTO(Employee employee);
    Employee toEntity(EmployeeDTO employeeDTO);
    List<EmployeeDTO> toDTO(List<Employee> employees);

    @Mapping(target = "id", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEmployeeFromDTO(EmployeeDTO employeeDTO, @MappingTarget Employee employee);

}
