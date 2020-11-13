package com.medibooking.bookingserviceserver.mappers;

import com.medibooking.bookingserviceserver.dtos.language.LanguageGetDto;
import com.medibooking.bookingserviceserver.dtos.language.LanguagePostDto;
import com.medibooking.bookingserviceserver.dtos.language.LanguagePutDto;
import com.medibooking.bookingserviceserver.entities.Language;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LanguageMapper {
    Language toEntity(LanguagePostDto languagePostDto);

    LanguageGetDto fromEntity(Language language);

    void copy(LanguagePutDto languagePutDto, @MappingTarget Language language);
}
