package com.igrejared.emprestaai.infrastructure.persistence.repository;

import com.igrejared.emprestaai.infrastructure.persistence.entities.CategoryEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryEntityRepositoryJPA extends JpaRepository<CategoryEntity, UUID> {

    Page<CategoryEntity> findAll(Pageable pageable);
}
