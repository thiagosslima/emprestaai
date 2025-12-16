package com.igrejared.emprestaai.domain.model;

import com.igrejared.emprestaai.domain.enums.EquipmentCondition;
import com.igrejared.emprestaai.domain.enums.EquipmentStatus;
import com.igrejared.emprestaai.domain.valueobject.EquipmentId;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Equipment {

    private EquipmentId id;
    private String name;
    private String description;
    private String brand;
    private String model;
    private String serialNumber;
    private Integer quantity;
    private LocalDateTime acquisitionDate;
    private EquipmentCondition condition;
    private EquipmentStatus status;
    private String storageLocation;
    private BigDecimal replacementCost;
    private String notes;
    private final LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Category category;

    public Equipment(String name, String description, String brand, String model, String serialNumber,
                     Integer quantity, LocalDateTime acquisitionDate, EquipmentCondition condition,
                     EquipmentStatus status, String storageLocation, BigDecimal replacementCost,
                     String notes, Category category) {
        if (name == null || quantity == null || condition == null || status == null ||
                storageLocation == null || category == null) {
            throw new IllegalArgumentException("Equipment fields cannot be null");
        }

        this.name = name;
        this.description = description;
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.quantity = quantity;
        this.acquisitionDate = acquisitionDate;
        this.condition = condition;
        this.status = status;
        this.storageLocation = storageLocation;
        this.replacementCost = replacementCost;
        this.notes = notes;
        this.createdAt = LocalDateTime.now();
        this.category = category;
    }

    public void update(Equipment newEquipment) {
        if (newEquipment == null) {
            throw new IllegalArgumentException("Equipment fields cannot be null");
        }

        this.id = newEquipment.id;
        this.name = newEquipment.name;
        this.description = newEquipment.description;
        this.brand = newEquipment.brand;
        this.model = newEquipment.model;
        this.serialNumber = newEquipment.serialNumber;
        this.quantity = newEquipment.quantity;
        this.acquisitionDate = newEquipment.acquisitionDate;
        this.condition = newEquipment.condition;
        this.status = newEquipment.status;
        this.storageLocation = newEquipment.storageLocation;
        this.replacementCost = newEquipment.replacementCost;
        this.notes = newEquipment.notes;
        this.category = newEquipment.category;
        this.updatedAt = LocalDateTime.now();
    }

    public void markAsLoaned() {
        this.status = EquipmentStatus.LOANED;
        this.updatedAt = LocalDateTime.now();
    }

    public void markAsInMaintenance() {
        this.status = EquipmentStatus.IN_MAINTENANCE;
        this.updatedAt = LocalDateTime.now();
    }

    public void markAsReserved() {
        this.status = EquipmentStatus.RESERVED;
        this.updatedAt = LocalDateTime.now();
    }

    public void markAsInactive() {
        this.status = EquipmentStatus.INACTIVE;
        this.updatedAt = LocalDateTime.now();
    }
}
