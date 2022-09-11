package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "hotel_inventory")
public class HotelInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Integer totalInventory;
    private Integer hoteel_id;
    private Integer room_type_id;

    public HotelInventory() {
    }

    public HotelInventory(Integer totalInventory, Integer hoteel_id, Integer room_type_id) {
        this.totalInventory = totalInventory;
        this.hoteel_id = hoteel_id;
        this.room_type_id = room_type_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTotalInventory() {
        return totalInventory;
    }

    public void setTotalInventory(Integer totalInventory) {
        this.totalInventory = totalInventory;
    }

    public Integer getHoteel_id() {
        return hoteel_id;
    }

    public void setHoteel_id(Integer hoteel_id) {
        this.hoteel_id = hoteel_id;
    }

    public Integer getRoom_type_id() {
        return room_type_id;
    }

    public void setRoom_type_id(Integer room_type_id) {
        this.room_type_id = room_type_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelInventory that = (HotelInventory) o;
        return Objects.equals(id, that.id) && Objects.equals(totalInventory, that.totalInventory) && Objects.equals(hoteel_id, that.hoteel_id) && Objects.equals(room_type_id, that.room_type_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, totalInventory, hoteel_id, room_type_id);
    }

    @Override
    public String toString() {
        return "HotelInventory{" +
                "id=" + id +
                ", totalInventory=" + totalInventory +
                ", hoteel_id=" + hoteel_id +
                ", room_type_id=" + room_type_id +
                '}';
    }
}
