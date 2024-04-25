package com.dovskyy.fixmyride.mapper;

import com.dovskyy.fixmyride.dto.VehicleManufacturerDto;
import com.dovskyy.fixmyride.model.VehicleManufacturer;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface VehicleManufacturerMapper {
    VehicleManufacturer toEntity(VehicleManufacturerDto vehicleManufacturerDto);

    VehicleManufacturerDto toDto(VehicleManufacturer vehicleManufacturer);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    VehicleManufacturer partialUpdate(VehicleManufacturerDto vehicleManufacturerDto, @MappingTarget VehicleManufacturer vehicleManufacturer);
}