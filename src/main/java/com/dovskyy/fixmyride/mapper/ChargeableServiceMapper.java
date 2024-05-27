package com.dovskyy.fixmyride.mapper;

import com.dovskyy.fixmyride.dto.ChargeableServiceDto;
import com.dovskyy.fixmyride.model.ChargeableService;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ChargeableServiceMapper {
    ChargeableService toEntity(ChargeableServiceDto chargeableServiceDto);

    ChargeableServiceDto toDto(ChargeableService chargeableService);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ChargeableService partialUpdate(ChargeableServiceDto chargeableServiceDto, @MappingTarget ChargeableService chargeableService);
}