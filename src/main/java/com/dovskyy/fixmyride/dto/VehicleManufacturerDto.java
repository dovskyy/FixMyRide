package com.dovskyy.fixmyride.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * DTO for {@link com.dovskyy.fixmyride.model.VehicleManufacturer}
 */
@Getter
@Setter
public class VehicleManufacturerDto implements Serializable {
    private Long id;
    private String name;
    private String country;
}