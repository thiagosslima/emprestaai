package com.igrejared.emprestaai.domain.dtos.request;

import com.igrejared.emprestaai.domain.enums.EquipmentCondition;
import com.igrejared.emprestaai.domain.enums.EquipmentStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record EquipmentRequestDto(
        @NotBlank(message = "Name cannot be blank")
        @Size(min = 1, max = 50, message = "Name must be between 1 and 50 characters")
        String name,

        @NotBlank(message = "Description cannot be blank")
        @Size(min = 1, max = 150, message = "Description must be between 1 and 150 characters")
        String description,

        @Size(min = 1, max = 50, message = "Brand must be between 1 and 50 characters")
        String brand,

        @Size(min = 1, max = 50, message = "Model must be between 1 and 50 characters")
        String model,

        @Size(min = 1, max = 100, message = "Serial Number must be between 1 and 100 characters")
        String serialNumber,

        @NotNull(message = "Quantity cannot be null")
        Integer quantity,

        @PastOrPresent(message = "Acquisition date must be in the past or present")
        LocalDateTime acquisitionDate,

        @NotBlank(message = "Condition cannot be blank")
        EquipmentCondition condition,

        EquipmentStatus status,

        @NotBlank(message = "Storage Location cannot be blank")
        String storageLocation,

        BigDecimal replacementCost,

        String notes,

        @NotNull(message = "Category cannot be null")
        CategoryRequestDto categoryId
) {
}
