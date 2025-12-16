package com.igrejared.emprestaai.infrastructure.persistence.repository;

import com.igrejared.emprestaai.infrastructure.persistence.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserEntityRepositoryJPA extends JpaRepository<UserEntity, UUID> {
}
