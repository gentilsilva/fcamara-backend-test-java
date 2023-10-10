package com.fcamaraparking.services;

import com.fcamaraparking.dtos.VehiclesDTO;
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

    @Transactional(readOnly = true)
    public List<VehiclesDTO> getAllVehicles() {
        return vehicleRepository.findAll().stream().map(VehiclesDTO::new).toList();
    }
}
