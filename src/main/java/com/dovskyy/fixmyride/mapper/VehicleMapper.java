package com.dovskyy.fixmyride.mapper;

import com.dovskyy.fixmyride.dto.VehicleDto;
import com.dovskyy.fixmyride.model.Vehicle;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface VehicleMapper {
    Vehicle toEntity(VehicleDto vehicleDto);

    VehicleDto toDto(Vehicle vehicle);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Vehicle partialUpdate(VehicleDto vehicleDto, @MappingTarget Vehicle vehicle);
}