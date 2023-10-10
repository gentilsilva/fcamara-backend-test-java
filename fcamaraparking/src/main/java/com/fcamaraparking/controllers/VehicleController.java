package com.fcamaraparking.controllers;

import com.fcamaraparking.dtos.VehicleDTO;
import com.fcamaraparking.dtos.VehicleForm;
import com.fcamaraparking.services.VehicleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping
    public ResponseEntity<VehicleDTO> createVehicle(@RequestBody VehicleForm vehicleForm, UriComponentsBuilder uriComponentsBuilder) {
        VehicleDTO vehicleDTO = vehicleService.createVehicle(vehicleForm);
        URI uri = uriComponentsBuilder.path("/vehicles/{id}").buildAndExpand(vehicleDTO.id()).toUri();
        return ResponseEntity.created(uri).body(vehicleDTO);
    }

    @GetMapping
    public ResponseEntity<List<VehicleDTO>> getAllvehicles() {
        return ResponseEntity.ok().body(vehicleService.getAllVehicles());
    }

}
