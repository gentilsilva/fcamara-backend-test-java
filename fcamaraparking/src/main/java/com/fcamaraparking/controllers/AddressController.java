package com.fcamaraparking.controllers;

import com.fcamaraparking.services.AddressService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addresService) {
        this.addressService = addresService;
    }

}
