package com.dovskyy.fixmyride.dto;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.dovskyy.fixmyride.model.VehiclePartManufacturer}
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class VehiclePartManufacturerDto implements Serializable {
    private Long id;
    private String name;
    private String country;
}