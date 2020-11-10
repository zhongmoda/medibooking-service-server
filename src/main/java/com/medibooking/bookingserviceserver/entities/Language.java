package com.medibooking.bookingserviceserver.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name = "languages")
public class Language {
    @Id
    @GeneratedValue
    @Column(name = "language_id")
    private Long id;

    @Column(name = "language_name")
    private String name;

    @ManyToMany
    @JoinTable(name = "doctor_language",
            joinColumns = @JoinColumn(name = "doctor_id"),
            inverseJoinColumns = @JoinColumn(name = "language_id"))
    private Set<Doctor> doctors;
}
