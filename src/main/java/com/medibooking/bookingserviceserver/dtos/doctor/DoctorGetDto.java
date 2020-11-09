package com.medibooking.bookingserviceserver.dtos.doctor;

import lombok.Data;
import java.util.UUID;

@Data
public class DoctorGetDto {
    private UUID id;
    private String firstName;
    private String secondName;
    private String userName;
}