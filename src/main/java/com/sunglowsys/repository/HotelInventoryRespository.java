package com.sunglowsys.repository;

import com.sunglowsys.domain.HotelInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface HotelInventoryRespository extends JpaRepository<HotelInventory, Long> {
}
