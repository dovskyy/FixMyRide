package com.dovskyy.fixmyride.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * DTO for {@link com.dovskyy.fixmyride.model.VehiclePart}
 */
@Getter
@Setter
public class VehiclePartDto implements Serializable {
    private Long id;
    private String name;
    private String description;
    private double price;
}