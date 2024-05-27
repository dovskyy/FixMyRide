package com.dovskyy.fixmyride.repository;

import com.dovskyy.fixmyride.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {

    List<Bill> findAllByDateBetween(LocalDate startDate, LocalDate endDate);

}
