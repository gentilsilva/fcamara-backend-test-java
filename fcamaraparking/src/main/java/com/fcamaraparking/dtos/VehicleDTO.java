package com.fcamaraparking.dtos;

import com.fcamaraparking.domain.vehicles.Vehicle;
import com.fcamaraparking.domain.vehicles.VehicleType;

public record VehicleDTO(
        Long id,
        String brand,
        String model,
        String color,
        String plate,
        VehicleType vehicleType
) {

    public VehicleDTO(Vehicle vehicle) {
        this(vehicle.getId(), vehicle.getBrand(), vehicle.getModel(), vehicle.getColor(), vehicle.getPlate(), vehicle.getVehicleType());
    }

}
