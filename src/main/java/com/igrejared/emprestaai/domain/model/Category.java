package com.igrejared.emprestaai.domain.model;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class Category {

    private UUID id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Category(String name, String description) {
        if(name == null || description == null) {
            throw new IllegalArgumentException("Category fields cannot be null");
        }
        this.name = name;
        this.description = description;
    }

    public void update(Category newCategory) {
        if(newCategory == null) {
            throw new IllegalArgumentException("Category cannot be null");
        }
        this.name = newCategory.getName();
        this.description = newCategory.getDescription();
        this.updatedAt = LocalDateTime.now();
    }
}
