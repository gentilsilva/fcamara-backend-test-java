package com.fcamaraparking.dtos;

import jakarta.validation.constraints.NotBlank;

public record VehicleForm(
        @NotBlank
        String brand,
        @NotBlank
        String model,
        @NotBlank
        String color,
        @NotBlank
        String plate,
        @NotBlank
        String vehicleType
) {
}
