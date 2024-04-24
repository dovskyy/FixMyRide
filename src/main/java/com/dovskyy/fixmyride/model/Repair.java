package com.dovskyy.fixmyride.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Repair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Vehicle vehicle;

    @ManyToMany
    @JoinTable(
            name = "repair_services",
            joinColumns = @JoinColumn(name = "repair_id"),
            inverseJoinColumns = @JoinColumn(name = "service_id" )
    )
    private List<Service> services;

    @ManyToMany
    @JoinTable(
            name = "repair_parts",
            joinColumns = @JoinColumn(name = "repair_id"),
            inverseJoinColumns = @JoinColumn(name = "part_id")
    )
    private List<VehiclePart> vehicleParts;

    @ManyToOne
    private Employee employee;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bill_id", referencedColumnName = "id")
    private Bill bill;
}
