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
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Type(type="uuid-binary")
    private UUID id;

    @Column(name = "first_name", unique = false, nullable = false)
    private String firstName;

    @Column(name = "second_name", unique = false, nullable = false)
    private String secondName;

    @Column(name = "user_name", unique = true, nullable = true)
    private String userName;

    @Column(name = "password", nullable = true)
    private String password;

}
