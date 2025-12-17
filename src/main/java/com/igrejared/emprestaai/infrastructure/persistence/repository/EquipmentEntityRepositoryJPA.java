package com.igrejared.emprestaai.infrastructure.persistence.repository;

import com.igrejared.emprestaai.infrastructure.persistence.entities.EquipmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface EquipmentEntityRepositoryJPA extends JpaRepository<EquipmentEntity, UUID> {
}
