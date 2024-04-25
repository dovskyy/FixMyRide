package com.dovskyy.fixmyride.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private VehicleManufacturer manufacturer;

    private String model;
    private String vin;
    private String registrationNumber;
    private Long mileage;
    private int year;

    public Vehicle() {
    }
}
