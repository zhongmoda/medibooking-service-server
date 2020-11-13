package com.medibooking.bookingserviceserver.repositories;

import com.medibooking.bookingserviceserver.entities.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecializationRepository extends JpaRepository<Specialization, Long> {
}