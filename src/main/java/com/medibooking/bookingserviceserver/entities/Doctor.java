package com.medibooking.bookingserviceserver.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

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

    @ManyToMany
    @JoinTable(name = "doctors_languages",
            joinColumns = @JoinColumn(name = "language_id"),
            inverseJoinColumns = @JoinColumn(name = "doctor_id"))
    private Set<Language> languages;

    @ManyToMany
    @JoinTable(name = "doctors_specializations",
            joinColumns = @JoinColumn(name = "specialization_id"),
            inverseJoinColumns = @JoinColumn(name = "doctor_id"))
    private Set<Specialization> specializations;

}
