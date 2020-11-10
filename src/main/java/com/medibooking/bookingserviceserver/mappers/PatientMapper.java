package com.medibooking.bookingserviceserver.mappers;

import com.medibooking.bookingserviceserver.dtos.patient.PatientGetDto;
import com.medibooking.bookingserviceserver.dtos.patient.PatientPostDto;
import com.medibooking.bookingserviceserver.dtos.patient.PatientPutDto;
import com.medibooking.bookingserviceserver.entities.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PatientMapper {
    Patient toEntity(PatientPostDto patientPostDto);
    PatientGetDto fromEntity(Patient patient);
    void copy(PatientPutDto patientPutDto, @MappingTarget Patient patient);
}
