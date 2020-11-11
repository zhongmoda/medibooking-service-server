package com.medibooking.bookingserviceserver.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Setter
@Getter
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue
    @Column(name = "appointment_id")
    private Long id;

    @Column(name = "appointment_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate date;

    @Column(name = "start_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH.mm")
    private LocalTime startTime;

    @Column(name = "end_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH.mm")
    private LocalTime endTime;

    @Column(name = "appointment_type")
    private String appointmentType;

    @Column(name = "is_cancelled")
    private String isCancelled;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;

}
