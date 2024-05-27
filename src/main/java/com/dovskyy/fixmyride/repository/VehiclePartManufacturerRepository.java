package com.dovskyy.fixmyride.repository;

import com.dovskyy.fixmyride.model.VehiclePartManufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiclePartManufacturerRepository extends JpaRepository<VehiclePartManufacturer, Long> {
}