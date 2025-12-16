package com.igrejared.emprestaai.infrastructure.persistence.repository;

import com.igrejared.emprestaai.infrastructure.persistence.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepositoryJPA extends JpaRepository<CategoryEntity, UUID> {
}
