package com.igrejared.emprestaai.domain.dtos.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserRequestDto {

    @NotBlank(message = "Full name cannot be blank")
    @Size(min = 1, max = 150, message = "Name must be between 1 and 150 characters")
    private String fullName;

    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Phone Number cannot be blank")
    private String phoneNumber;
}
