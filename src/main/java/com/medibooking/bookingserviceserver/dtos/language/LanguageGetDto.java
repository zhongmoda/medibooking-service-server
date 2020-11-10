package com.medibooking.bookingserviceserver.dtos.language;

import com.medibooking.bookingserviceserver.entities.Doctor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
public class LanguageGetDto {
    private Long id;
    private String name;
    private Set<Doctor> doctorIds;
}
