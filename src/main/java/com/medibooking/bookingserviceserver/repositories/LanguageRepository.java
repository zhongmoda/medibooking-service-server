package com.medibooking.bookingserviceserver.repositories;

import com.medibooking.bookingserviceserver.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Long> {
}
