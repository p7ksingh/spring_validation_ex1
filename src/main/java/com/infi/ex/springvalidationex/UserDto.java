package com.infi.ex.springvalidationex;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    @NotBlank(message = "username should not be null")
    private String name;
    @Email(message = "invalid email address")
    private String email;
    @Pattern(regexp = "^\\d{10}$", message = "invalid mobile number entered")
    private String mobile;
    
    private String gender;
    @Min(25)
    @Max(90)
    private int age;
    @NotBlank
    private String nationality;
}
