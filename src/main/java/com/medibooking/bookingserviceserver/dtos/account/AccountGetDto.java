package com.medibooking.bookingserviceserver.dtos.account;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountGetDto {
    private String username;
    private String encodedPassword;
}
