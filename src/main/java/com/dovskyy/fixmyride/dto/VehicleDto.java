package com.dovskyy.fixmyride.dto;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.dovskyy.fixmyride.model.Vehicle}
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class VehicleDto implements Serializable {
    private Long id;
    private String model;
    private String vin;
    private String registrationNumber;
    private Long mileage;
    private int year;
}