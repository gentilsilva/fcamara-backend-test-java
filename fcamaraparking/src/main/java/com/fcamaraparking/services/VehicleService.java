package com.fcamaraparking.services;

import com.fcamaraparking.domain.vehicles.Vehicle;
import com.fcamaraparking.dtos.VehicleDTO;
import com.fcamaraparking.dtos.VehicleForm;
import com.fcamaraparking.repositories.VehicleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Transactional
    public VehicleDTO createVehicle(VehicleForm vehicleForm) {
        Vehicle vehicle = new Vehicle(vehicleForm);
        vehicleRepository.save(vehicle);
        return new VehicleDTO(vehicle);
    }

    @Transactional(readOnly = true)
    public List<VehicleDTO> getAllVehicles() {
        return vehicleRepository.findAll().stream().map(VehicleDTO::new).toList();
    }

}
