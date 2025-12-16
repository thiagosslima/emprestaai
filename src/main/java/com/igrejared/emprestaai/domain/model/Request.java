package com.igrejared.emprestaai.domain.model;

import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class Request {

    private UUID id;
    private LocalDate requestDate;
    private String area;
    private LocalDateTime eventDateStart;
    private LocalDateTime eventDateEnd;
    private String status;
    private User approvedByUser;
    private LocalDateTime approvalDate;
    private String notes;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
