package com.medibooking.bookingserviceserver.dtos.appointment;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.medibooking.bookingserviceserver.entities.Doctor;
import com.medibooking.bookingserviceserver.entities.Patient;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
public class AppointmentPutDto {

    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate date;

    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime startTime;

    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime endTime;

    private String appointmentType;

    private String isCancelled;

    private Long patient;

    private Long doctor;
}
