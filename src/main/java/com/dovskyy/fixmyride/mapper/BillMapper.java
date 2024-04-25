package com.dovskyy.fixmyride.mapper;

import com.dovskyy.fixmyride.model.Bill;
import com.dovskyy.fixmyride.dto.BillDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface BillMapper {
    Bill toEntity(BillDto billDto);

    BillDto toDto(Bill bill);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Bill partialUpdate(BillDto billDto, @MappingTarget Bill bill);
}