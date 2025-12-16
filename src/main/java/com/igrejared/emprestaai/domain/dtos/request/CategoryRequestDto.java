package com.igrejared.emprestaai.domain.dtos.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CategoryRequestDto(

        @NotBlank(message = "Name cannot be blank")
        @Size(min = 1, max = 50, message = "Name must be between 1 and 50 characters")
        String name,

        @NotBlank(message = "Description cannot be blank")
        @Size(min = 1, max = 150, message = "Description must be between 1 and 150 characters")
        String description) {
}
