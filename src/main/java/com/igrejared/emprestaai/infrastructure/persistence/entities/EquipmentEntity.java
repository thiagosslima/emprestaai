package com.igrejared.emprestaai.infrastructure.persistence.entities;

import com.igrejared.emprestaai.domain.enums.EquipmentCondition;
import com.igrejared.emprestaai.domain.enums.EquipmentStatus;
import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Entity
@Table(name = "equipments")
public class EquipmentEntity {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "serial_number")
    private String serialNumber;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "acquisition_date")
    private LocalDateTime acquisitionDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "condition", nullable = false)
    private EquipmentCondition condition;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private EquipmentStatus status;

    @Column(name = "storage_location", nullable = false)
    private String storageLocation;

    @Column(name = "replacement_cost")
    private BigDecimal replacementCost;

    @Column(name = "notes")
    private String notes;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private CategoryEntity category;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}
