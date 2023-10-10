package com.fcamaraparking.repositories;

import com.fcamaraparking.domain.vehicles.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
