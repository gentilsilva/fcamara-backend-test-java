package com.fcamaraparking.controllers;

import com.fcamaraparking.dtos.VehiclesDTO;
import com.fcamaraparking.services.VehicleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public ResponseEntity<List<VehiclesDTO>> getAllvehicles() {
        return ResponseEntity.ok().body(vehicleService.getAllVehicles());
    }

}
