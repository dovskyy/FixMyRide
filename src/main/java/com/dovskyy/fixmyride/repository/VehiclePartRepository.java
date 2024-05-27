package com.dovskyy.fixmyride.repository;

import com.dovskyy.fixmyride.model.VehiclePart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiclePartRepository extends JpaRepository<VehiclePart, Long> {
}