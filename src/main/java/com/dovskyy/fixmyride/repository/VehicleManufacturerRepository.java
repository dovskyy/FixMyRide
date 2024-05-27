package com.dovskyy.fixmyride.repository;

import com.dovskyy.fixmyride.model.VehicleManufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleManufacturerRepository extends JpaRepository<VehicleManufacturer, Long> {
}