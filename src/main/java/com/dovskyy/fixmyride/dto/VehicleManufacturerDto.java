package com.dovskyy.fixmyride.dto;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.dovskyy.fixmyride.model.VehicleManufacturer}
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class VehicleManufacturerDto implements Serializable {
    private Long id;
    private String name;
    private String country;
}