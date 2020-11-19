package com.medibooking.bookingserviceserver.mappers;

import com.medibooking.bookingserviceserver.dtos.account.AccountGetDto;
import com.medibooking.bookingserviceserver.dtos.account.AccountPostDto;
import com.medibooking.bookingserviceserver.dtos.account.AccountPutDto;
import com.medibooking.bookingserviceserver.entities.Account;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface AccountMapper {

    AccountGetDto fromEntity(Account account);

    Account toEntity(AccountPostDto accountPostDto);

    void copy(AccountPutDto accountPutDto, @MappingTarget Account account);
}
