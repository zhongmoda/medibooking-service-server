package com.medibooking.bookingserviceserver.dtos.specialization;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SpecializationGetDto {
    private Long id;
    private String specializationName;
}
