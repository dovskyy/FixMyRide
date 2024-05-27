package com.dovskyy.fixmyride.repository;

import com.dovskyy.fixmyride.model.ChargeableService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChargeableServiceRepository extends JpaRepository<ChargeableService, Long> {
}