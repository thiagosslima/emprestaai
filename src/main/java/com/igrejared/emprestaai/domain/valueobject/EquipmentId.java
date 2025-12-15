package com.igrejared.emprestaai.domain.valueobject;

import java.util.UUID;

public record EquipmentId(UUID value) {

    public EquipmentId {
        if (value == null) {
            throw new IllegalArgumentException("EquipmentId cannot be null");
        }
    }

    public static EquipmentId generate() {
        return new EquipmentId(UUID.randomUUID());
    }
}
