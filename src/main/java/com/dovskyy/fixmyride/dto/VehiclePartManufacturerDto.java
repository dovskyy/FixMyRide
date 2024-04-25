package com.dovskyy.fixmyride.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * DTO for {@link com.dovskyy.fixmyride.model.VehiclePartManufacturer}
 */
@Getter
@Setter
public class VehiclePartManufacturerDto implements Serializable {
    private Long id;
    private String name;
    private String country;
}