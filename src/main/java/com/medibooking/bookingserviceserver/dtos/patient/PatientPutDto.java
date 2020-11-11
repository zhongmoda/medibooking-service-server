package com.medibooking.bookingserviceserver.dtos.patient;

import lombok.Data;

import java.util.UUID;

@Data
public class PatientPutDto {
    private Long id;
    private int age;
    private String gender;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
}
