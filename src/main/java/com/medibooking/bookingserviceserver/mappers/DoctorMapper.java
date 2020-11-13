package com.medibooking.bookingserviceserver.mappers;

import com.medibooking.bookingserviceserver.dtos.doctor.DoctorGetDto;
import com.medibooking.bookingserviceserver.dtos.doctor.DoctorPostDto;
import com.medibooking.bookingserviceserver.dtos.doctor.DoctorPutDto;
import com.medibooking.bookingserviceserver.entities.Doctor;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DoctorMapper {
    Doctor toEntity(DoctorPostDto doctorPostDto);

    DoctorGetDto fromEntity(Doctor doctor);

    void copy(DoctorPutDto doctorPutDto, @MappingTarget Doctor doctor);
}
