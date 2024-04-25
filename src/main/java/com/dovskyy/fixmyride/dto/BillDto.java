package com.dovskyy.fixmyride.dto;

import com.dovskyy.fixmyride.model.Bill;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link Bill}
 */
@Getter
@Setter
public class BillDto implements Serializable {
    private Long id;
    private double totalAmount;
    private LocalDate date;
}