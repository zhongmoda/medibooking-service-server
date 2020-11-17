package com.medibooking.bookingserviceserver.entities;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@MappedSuperclass
public abstract class User {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    private Account account;

}
