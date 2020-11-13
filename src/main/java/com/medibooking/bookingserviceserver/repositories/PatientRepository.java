package com.medibooking.bookingserviceserver.repositories;

import com.medibooking.bookingserviceserver.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface
PatientRepository extends JpaRepository<Patient, Long> {
    Patient findByFirstName(String firstName);

}
