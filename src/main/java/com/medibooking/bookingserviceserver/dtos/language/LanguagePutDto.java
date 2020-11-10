package com.medibooking.bookingserviceserver.dtos.language;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LanguagePutDto {
    private Long id;
    private String name;
}
