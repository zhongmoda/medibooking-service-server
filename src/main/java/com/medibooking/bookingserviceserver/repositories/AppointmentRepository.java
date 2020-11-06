package com.medibooking.bookingserviceserver.repositories;


import com.medibooking.bookingserviceserver.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {

    @Query("select a from Appointment a where a.patient= :patientId")
    List<Appointment> findAppointmentsByPatientId(@Param("patient") Long patientId);

    @Query("select a from Appointment a where a.doctor= :doctorId")
    List<Appointment> findAppointmentsByDoctorId(@Param("doctor") Long doctorId);

    @Query("select a from Appointment a where a.patient= :patientId and a.date= :date")
    List<Appointment> findAppointmentsOfAPatientByDate(@Param("patient") Long patientId, LocalDate date);

    @Query("select a from Appointment a where a.patient= :doctorId and a.date= :date")
    List<Appointment> findAppointmentsOfADoctorByDate(@Param("patient") Long doctorId, LocalDate date);
}
