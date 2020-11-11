package com.medibooking.bookingserviceserver.dtos.appointment;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.medibooking.bookingserviceserver.entities.Doctor;
import com.medibooking.bookingserviceserver.entities.Patient;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor
public class AppointmentPostDto {

//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate date;

//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "hh.mm")
    @JsonFormat(pattern = "HH:mm:ss")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime startTime;

//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "hh.mm")
    @JsonFormat(pattern = "HH:mm:ss")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime endTime;

    private String appointmentType;

    private String isCancelled;

    private Long patient;

    private Long doctor;
}
