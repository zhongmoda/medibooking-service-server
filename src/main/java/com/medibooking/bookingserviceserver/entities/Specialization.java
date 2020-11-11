package com.medibooking.bookingserviceserver.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
@Getter
@Setter
@Table(name="specialization")
public class Specialization {
    @Id
    @GeneratedValue
    @Column(name = "id", unique=true, nullable=false)
    private Long id;

    @Column(name = "specialization_name", unique=false, nullable=false)
    private String speName;
}
