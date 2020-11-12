package com.medibooking.bookingserviceserver.dtos.specialization;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@NoArgsConstructor
public class SpecializationPutDto {
    private Long id;
    private String speName;
}
