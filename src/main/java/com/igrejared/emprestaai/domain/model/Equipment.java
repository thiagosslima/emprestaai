package com.igrejared.emprestaai.domain.model;

import com.igrejared.emprestaai.domain.enums.EquipmentConditionEnum;
import com.igrejared.emprestaai.domain.enums.EquipmentStatusEnum;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Equipment {

    private UUID id;
    private String name;
    private String description;
    private String brand;
    private String model;
    private String serialNumber;
    private int quantity;
    private LocalDateTime acquisitionDate;
    private EquipmentConditionEnum condition;
    private EquipmentStatusEnum status;
    private String storageLocation;
    private BigDecimal replacementCost;
    private String notes;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Category category;
}
