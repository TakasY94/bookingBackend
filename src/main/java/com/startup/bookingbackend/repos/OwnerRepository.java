package com.startup.bookingbackend.repos;

import com.startup.bookingbackend.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OwnerRepository extends JpaRepository<Owner, Integer> {
}
