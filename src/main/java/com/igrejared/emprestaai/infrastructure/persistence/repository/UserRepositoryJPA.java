package com.igrejared.emprestaai.infrastructure.persistence.repository;

import com.igrejared.emprestaai.infrastructure.persistence.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepositoryJPA extends JpaRepository<UserEntity, UUID> {
}
