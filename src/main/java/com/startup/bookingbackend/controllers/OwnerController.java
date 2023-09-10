package com.startup.bookingbackend.controllers;

import com.startup.bookingbackend.entities.Owner;
import com.startup.bookingbackend.services.OwnerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/owners")
public class OwnerController {

    private OwnerService ownerService;
    @GetMapping("/listAll")
    public List<Owner> listAll(){
        return ownerService.findAll();
    }
}
