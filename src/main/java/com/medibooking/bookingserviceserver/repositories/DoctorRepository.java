package com.medibooking.bookingserviceserver.repositories;

import com.medibooking.bookingserviceserver.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Doctor findByUserName(String userName);
}
