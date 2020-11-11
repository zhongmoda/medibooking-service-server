package com.medibooking.bookingserviceserver.entities;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue
    @Column(name = "doctor_id")
    private Long id;

    @Column(name = "first_name", unique = false, nullable = false)
    private String firstName;

    @Column(name = "last_name", unique = false, nullable = false)
    private String lastName;

    @Column(name = "user_name", unique = true, nullable = true)
    private String userName;

    @Column(name = "password", nullable = true)
    private String password;

}
