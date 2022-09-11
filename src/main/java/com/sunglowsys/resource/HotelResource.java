package com.sunglowsys.resource;

import com.sunglowsys.domain.HotelInventory;
import com.sunglowsys.service.HotelInventoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class HotelResource {
    private final Logger logger = LoggerFactory.getLogger(HotelResource.class);
    private final HotelInventoryService hotelInventoryService;

    public HotelResource(HotelInventoryService hotelInventoryService) {
        this.hotelInventoryService = hotelInventoryService;
    }
    @PostMapping("/hotelInventory")
    public ResponseEntity<HotelInventory> createHotelInventory(HotelInventory hotelInventory){
        logger.debug("request to create hotelInventory:{}",hotelInventory);
        HotelInventory result = hotelInventoryService.save(hotelInventory);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
    @PutMapping("/hotelInventory")
    public ResponseEntity<HotelInventory> updateHotelInventory(HotelInventory hotelInventory){
        logger.debug("request to update hotelInventory:{}",hotelInventory);
        HotelInventory result = hotelInventoryService.update(hotelInventory);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @GetMapping("/api")
    public ResponseEntity<Page<HotelInventory>> findAllHotelInventory(Pageable pageable) {
        logger.debug("request to findAll hotelInvetory:{}",pageable);
        Page<HotelInventory> result = hotelInventoryService.findAll(pageable);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @GetMapping("/api/{id}")
    public ResponseEntity<Optional<HotelInventory>> findOneHotelInventory(Long id) {
        logger.debug("request to findOne hotelInventory:{}",id);
        Optional<HotelInventory> result = hotelInventoryService.findOne(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    public ResponseEntity<Void> deleteHotelInventory(Long id) {
        logger.debug("request to delete hotelInventory");
        hotelInventoryService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
