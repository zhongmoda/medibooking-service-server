package com.medibooking.bookingserviceserver.dtos.doctor;

import lombok.Data;

@Data
public class DoctorPutDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
}