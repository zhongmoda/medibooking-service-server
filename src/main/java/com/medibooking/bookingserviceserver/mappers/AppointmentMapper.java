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
    
    Appointment toEntity(AppointmentPostDto appointmentPostDto);
    AppointmentGetDto fromEntity(Appointment appointment);
    List<AppointmentGetDto> fromEntities(List<Appointment> appointments);
    void copy(AppointmentPutDto appointmentPutDto, @MappingTarget Appointment appointment);
}
