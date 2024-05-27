package com.dovskyy.fixmyride.dto;

import com.dovskyy.fixmyride.model.Bill;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link Bill}
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class BillDto implements Serializable {
    private Long id;
    private double totalAmount;
    private LocalDate date;
    private CustomerDto customer;
    private VehiclePartDto vehiclePart;
    private VehiclePartManufacturerDto vehiclePartManufacturer;
    private VehicleManufacturerDto vehicleManufacturer;
}