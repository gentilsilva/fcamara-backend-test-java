package com.fcamaraparking.dtos;

import com.fcamaraparking.domain.vehicles.Vehicle;
import com.fcamaraparking.domain.vehicles.VehiclesType;
import jakarta.persistence.Column;

public record VehiclesDTO(
        Long id,
        String brand,
        String model,
        String color,
        String plate,
        VehiclesType vehiclesType
) {

    public VehiclesDTO(Vehicle vehicle) {
        this(vehicle.getId(), vehicle.getBrand(), vehicle.getModel(), vehicle.getColor(), vehicle.getPlate(), vehicle.getVehiclesType());
    }

}
