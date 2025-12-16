package com.igrejared.emprestaai.domain.valueobject;

import java.util.UUID;

public record CategoryId(UUID value) {

    public CategoryId {
        if (value == null) {
            throw new IllegalArgumentException("CategoryId cannot be null");
        }
    }

    public static CategoryId generate() {
        return new CategoryId(UUID.randomUUID());
    }
}
