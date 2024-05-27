package com.dovskyy.fixmyride.dto;

import com.dovskyy.fixmyride.model.ChargeableService;
import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link ChargeableService}
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ChargeableServiceDto implements Serializable {
    private Long id;
    private String name;
    private String description;
    private double price;
}