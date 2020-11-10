package com.medibooking.bookingserviceserver.dtos.doctor;

import lombok.Data;

import java.util.UUID;

@Data
public class DoctorPutDto {
    private UUID id;
    private String firstName;
    private String secondName;
    private String userName;
    private String password;
}