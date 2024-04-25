package com.dovskyy.fixmyride.mapper;

import com.dovskyy.fixmyride.dto.ServiceDto;
import com.dovskyy.fixmyride.model.Service;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ServiceMapper {
    Service toEntity(ServiceDto serviceDto);

    ServiceDto toDto(Service service);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Service partialUpdate(ServiceDto serviceDto, @MappingTarget Service service);
}