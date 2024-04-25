package com.dovskyy.fixmyride.mapper;

import com.dovskyy.fixmyride.dto.VehiclePartDto;
import com.dovskyy.fixmyride.model.VehiclePart;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface VehiclePartMapper {
    VehiclePart toEntity(VehiclePartDto vehiclePartDto);

    VehiclePartDto toDto(VehiclePart vehiclePart);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    VehiclePart partialUpdate(VehiclePartDto vehiclePartDto, @MappingTarget VehiclePart vehiclePart);
}