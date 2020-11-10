package com.medibooking.bookingserviceserver.services;

import com.medibooking.bookingserviceserver.dtos.language.LanguageGetDto;
import com.medibooking.bookingserviceserver.dtos.language.LanguagePostDto;
import com.medibooking.bookingserviceserver.entities.Language;
import com.medibooking.bookingserviceserver.mappers.LanguageMapper;
import com.medibooking.bookingserviceserver.repositories.LanguageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LanguageService {
    private final LanguageRepository languageRepository;
    private final LanguageMapper languageMapper;

    public List<LanguageGetDto> getAllLanguages(){
        return languageRepository.findAll().stream()
                .map(language -> languageMapper.fromEntity(language))
                .collect(Collectors.toList());
    }

    public LanguageGetDto createLanguage(LanguagePostDto languagePostDto){
        Language language = languageMapper.toEntity(languagePostDto);
        languageRepository.save(language);

        return languageMapper.fromEntity(language);
    }
}
