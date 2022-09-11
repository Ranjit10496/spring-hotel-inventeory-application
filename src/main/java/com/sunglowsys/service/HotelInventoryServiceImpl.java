package com.sunglowsys.service;


import com.sunglowsys.domain.HotelInventory;
import com.sunglowsys.repository.HotelInventoryRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Service
@Transactional

public class HotelInventoryServiceImpl implements HotelInventoryService{
    private final Logger logger = LoggerFactory.getLogger(HotelInventoryServiceImpl.class);
    private final HotelInventoryRespository hotelInventoryRespository;

    public HotelInventoryServiceImpl(HotelInventoryRespository hotelInventoryRespository) {
        this.hotelInventoryRespository = hotelInventoryRespository;
    }


    @Override
    public HotelInventory save(HotelInventory hotelInventory) {
        logger.debug("request to save hotelInventory:{}",hotelInventory);
        return hotelInventoryRespository.save(hotelInventory);
    }

    @Override
    public HotelInventory update(HotelInventory hotelInventory) {
        logger.debug("request to update hotelInventory:{}",hotelInventory);
        return hotelInventoryRespository.save(hotelInventory);
    }

    @Override
    public Page<HotelInventory> findAll(Pageable pageable) {
        logger.debug("request to findAll hotelInventory:{}",pageable);
        return hotelInventoryRespository.findAll(pageable);
    }

    @Override
    public Optional<HotelInventory> findOne(Long id) {
        logger.debug("request to findOne hotelInventory:{}",id);
        return hotelInventoryRespository.findById(id);
    }

    @Override
    public void delete(Long id) {
        logger.debug("request to delete hotelInventory:{}",id);
        hotelInventoryRespository.deleteById(id);

    }
}
