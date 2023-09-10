package com.startup.bookingbackend.services;

import com.startup.bookingbackend.entities.Owner;
import com.startup.bookingbackend.repos.OwnerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OwnerService {

    private OwnerRepository ownerRepository;

    public List<Owner> findAll() {
        return ownerRepository.findAll();
    }
}
