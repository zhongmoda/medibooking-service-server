package com.medibooking.bookingserviceserver.services;

import com.medibooking.bookingserviceserver.dtos.patient.PatientGetDto;
import com.medibooking.bookingserviceserver.dtos.patient.PatientPostDto;
import com.medibooking.bookingserviceserver.dtos.patient.PatientPutDto;
import com.medibooking.bookingserviceserver.entities.Patient;
import com.medibooking.bookingserviceserver.mappers.PatientMapper;
import com.medibooking.bookingserviceserver.repositories.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;
    private final PatientMapper patientMapper;

    public PatientGetDto create(PatientPostDto patientPostDto) {

        Patient patientEntity = patientMapper.toEntity(patientPostDto);
        return patientMapper.fromEntity(patientRepository.save(patientEntity));
    }

    public PatientGetDto modify(Long patientId, PatientPutDto patientPutDto) {
        Patient patient = new Patient();
        patientMapper.copy(patientPutDto, patient);
        patient.setId(patientId);
        return patientMapper.fromEntity(patientRepository.save(patient));
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public PatientGetDto findPatientById(Long id) {
        return patientMapper.fromEntity(patientRepository.getOne(id));
    }

    public PatientGetDto findPatientByName(String name) {
        return patientMapper.fromEntity(patientRepository.findByFirstName(name));
    }

    public void delete(Long id) {
        patientRepository.deleteById(id);
    }
}
