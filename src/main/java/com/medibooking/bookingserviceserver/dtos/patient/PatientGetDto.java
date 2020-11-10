package com.medibooking.bookingserviceserver.dtos.patient;

import lombok.Data;

import javax.persistence.Column;
import java.util.UUID;

@Data
public class PatientGetDto {
    private UUID id;
    private int age;

    private String gender;

    private String firstName;

    private String lastName;

    private String userName;
}
