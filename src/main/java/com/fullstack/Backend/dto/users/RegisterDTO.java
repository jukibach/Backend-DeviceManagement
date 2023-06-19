package com.fullstack.Backend.dto.users;

import com.fullstack.Backend.validation.annotations.PasswordMatches;
import com.fullstack.Backend.validation.annotations.ValidEmail;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.Set;

@PasswordMatches
@Data
public class RegisterDTO {
    @NotNull
    @NotEmpty
    @Size(min = 3, max = 20)
    private String userName;

    @NotNull
    @NotEmpty
    @Size(max = 50)
    @ValidEmail
    private String email;
    @NotNull
    @NotEmpty
    private Set<String> role;

    @NotNull
    @NotEmpty
    @Size(min = 6, max = 40)
    private String password;
    private String matchingPassword;

    @NotNull
    @NotEmpty
    @Size(min = 6, max = 40)
    private String badgeId;

    @NotNull
    @NotEmpty
    @Size(max = 40)
    private String firstName;

    @NotNull
    @NotEmpty
    @Size(max = 40)
    private String lastName;

    @NotNull
    @NotEmpty
    @Size(min = 10, max = 12)
    private String phoneNumber;

    @NotNull
    @NotEmpty
    private String project;
}