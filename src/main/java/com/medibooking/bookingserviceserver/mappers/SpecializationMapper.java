package com.medibooking.bookingserviceserver.mappers;
import com.medibooking.bookingserviceserver.dtos.specialization.SpecializationGetDto;
import com.medibooking.bookingserviceserver.dtos.specialization.SpecializationPostDto;
import com.medibooking.bookingserviceserver.dtos.specialization.SpecializationPutDto;
import com.medibooking.bookingserviceserver.entities.Specialization;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel="spring", unmappedTargetPolicy=ReportingPolicy.IGNORE)
public interface SpecializationMapper {
    Specialization toEntity(SpecializationPostDto spePostDto);
    SpecializationGetDto fromEntity(Specialization spe);
    void copy(SpecializationPutDto spePutDto, @MappingTarget Specialization spe);
}
