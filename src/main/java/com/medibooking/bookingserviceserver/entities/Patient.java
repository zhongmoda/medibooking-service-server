package com.medibooking.bookingserviceserver.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "patients")
public class Patient extends User {
    @Id
    @GeneratedValue
    @Column(name = "patient_id")
    private Long id;

    @Column(name = "age")
    private int age;

    @Column(name = "gender")
    private String gender;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

}
