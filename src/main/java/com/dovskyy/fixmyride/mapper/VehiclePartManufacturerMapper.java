package com.dovskyy.fixmyride.mapper;

import com.dovskyy.fixmyride.dto.VehiclePartManufacturerDto;
import com.dovskyy.fixmyride.model.VehiclePartManufacturer;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface VehiclePartManufacturerMapper {
    VehiclePartManufacturer toEntity(VehiclePartManufacturerDto vehiclePartManufacturerDto);

    VehiclePartManufacturerDto toDto(VehiclePartManufacturer vehiclePartManufacturer);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    VehiclePartManufacturer partialUpdate(VehiclePartManufacturerDto vehiclePartManufacturerDto, @MappingTarget VehiclePartManufacturer vehiclePartManufacturer);
}