package com.igrejared.emprestaai.domain.model;

import com.igrejared.emprestaai.domain.valueobject.CategoryId;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class Category {

    private CategoryId id;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Category(UUID id, String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name fields cannot be null");
        }
        this.id = id == null ? CategoryId.generate() : new CategoryId(id);
        this.name = name;
    }

    public void update(Category newCategory) {
        if (newCategory == null) {
            throw new IllegalArgumentException("Category cannot be null");
        }
        this.id = newCategory.id;
        this.name = newCategory.getName();
        this.updatedAt = LocalDateTime.now();
    }
}
