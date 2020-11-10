package com.medibooking.bookingserviceserver.dtos.appointment;

import com.medibooking.bookingserviceserver.entities.Doctor;
import com.medibooking.bookingserviceserver.entities.Patient;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
public class AppointmentPostDto {

    private LocalDate date;

    private LocalTime startTime;

    private LocalTime endTime;

    private String appointmentType;

    private String isCancelled;

    private Long patient;

    private Long doctor;
}
