package com.igrejared.emprestaai.domain.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Category {

    private UUID id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
