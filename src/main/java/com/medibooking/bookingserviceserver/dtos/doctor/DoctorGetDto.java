package com.medibooking.bookingserviceserver.dtos.doctor;

import lombok.Data;

@Data
public class DoctorGetDto {
    private Long id;
    private int age;
    private String gender;
    private String firstName;
    private String lastName;

}