package com.medibooking.bookingserviceserver.dtos.doctor;

import lombok.Data;
import java.util.UUID;

@Data
public class DoctorPostDto {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
}