package com.medibooking.bookingserviceserver.controllers;

import com.medibooking.bookingserviceserver.dtos.account.AccountGetDto;
import com.medibooking.bookingserviceserver.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("management/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping
    public ResponseEntity<List<AccountGetDto>> getAll(){
        return ResponseEntity.ok(accountService.getAllAccounts());
    }

    @GetMapping("/{username}")
    public ResponseEntity<AccountGetDto> getByUsername(@PathVariable String username){
        return ResponseEntity.ok(accountService.findAccountByUsername(username));
    }

}
