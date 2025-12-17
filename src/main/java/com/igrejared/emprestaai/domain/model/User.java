package com.igrejared.emprestaai.domain.model;

import com.igrejared.emprestaai.domain.enums.UserStatus;
import com.igrejared.emprestaai.domain.valueobject.UserId;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class User {

    private UserId id;
    private String fullName;
    private String email;
    private String phoneNumber;
    private UserStatus status;
    private final LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public User(UserId id, String fullName, String email, String phoneNumber) {
        if (id == null || fullName == null || email == null || phoneNumber == null) {
            throw new IllegalArgumentException("User fields cannot be null");
        }

        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.status = UserStatus.ACTIVE;
        this.createdAt = LocalDateTime.now();
    }

    public void update(User newUser) {
        if (newUser == null) {
            throw new IllegalArgumentException("User fields cannot be null");
        }

        this.id = newUser.id;
        this.fullName = newUser.fullName;
        this.email = newUser.email;
        this.phoneNumber = newUser.phoneNumber;
        updateAt();
    }

    public void markAsInactive() {
        this.status = UserStatus.INACTIVE;
        updateAt();
    }

    public void markAsSuspended() {
        this.status = UserStatus.SUSPENDED;
        updateAt();
    }

    public void markAsDeleted() {
        this.status = UserStatus.DELETED;
        updateAt();
    }

    public void updateAt() {
        this.updatedAt = LocalDateTime.now();
    }
}
