package com.medibooking.bookingserviceserver.mappers;

import com.medibooking.bookingserviceserver.dtos.appointment.AppointmentGetDto;
import com.medibooking.bookingserviceserver.dtos.appointment.AppointmentPostDto;
import com.medibooking.bookingserviceserver.dtos.appointment.AppointmentPutDto;
import com.medibooking.bookingserviceserver.entities.Appointment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface AppointmentMapper {
    @Mapping(target = "patient.id", source = "patient")
    @Mapping(target = "doctor.id", source = "doctor")
    Appointment toEntity(AppointmentPostDto appointmentPostDto);

    @Mapping(target = "patient", source = "patient.id")
    @Mapping(target = "doctor", source = "doctor.id")
    AppointmentGetDto fromEntity(Appointment appointment);

    @Mapping(target = "patient", source = "patient.id")
    @Mapping(target = "doctor", source = "doctor.id")
    List<AppointmentGetDto> fromEntities(List<Appointment> appointments);

    @Mapping(target = "patient.id", source = "patient")
    @Mapping(target = "doctor.id", source = "doctor")
    void copy(AppointmentPutDto appointmentPutDto, @MappingTarget Appointment appointment);
}
