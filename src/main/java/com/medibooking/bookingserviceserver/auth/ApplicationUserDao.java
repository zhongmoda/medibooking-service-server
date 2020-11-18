package com.medibooking.bookingserviceserver.auth;

import java.util.Optional;

public interface ApplicationUserDao {
    Optional<ApplicationUserDetails> fetchAccountByUsername(String username);
}
