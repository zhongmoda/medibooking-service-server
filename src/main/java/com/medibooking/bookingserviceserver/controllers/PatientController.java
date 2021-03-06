package com.medibooking.bookingserviceserver.controllers;

import com.medibooking.bookingserviceserver.dtos.patient.PatientGetDto;
import com.medibooking.bookingserviceserver.dtos.patient.PatientPostDto;
import com.medibooking.bookingserviceserver.dtos.patient.PatientPutDto;
import com.medibooking.bookingserviceserver.entities.Patient;
import com.medibooking.bookingserviceserver.services.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/patients")
public class PatientController {
    private final PatientService patientService;

    @PostMapping
    public ResponseEntity<PatientGetDto> add(@RequestBody PatientPostDto patientPostDto) {
        PatientGetDto patientGetDto = patientService.create(patientPostDto);
        return ResponseEntity.ok(patientGetDto);
    }

    @GetMapping
    public ResponseEntity<List<Patient>> find() {
        List<Patient> list = patientService.getAllPatients();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{patientId}")
    public ResponseEntity<PatientGetDto> findById(@PathVariable Long patientId) {
        return ResponseEntity.ok(patientService.findPatientById(patientId));
    }

    @GetMapping("search")
    public ResponseEntity<PatientGetDto> findByName(@RequestParam String patientName) {
        return ResponseEntity.ok(patientService.findPatientByName(patientName));
    }

    @PutMapping("/{patientId}")
    public ResponseEntity<PatientGetDto> update(@PathVariable Long patientId, @RequestBody PatientPutDto patientPutDto) {
        return ResponseEntity.ok(patientService.modify(patientId, patientPutDto));
    }

    @DeleteMapping("/{patientId}")
    public ResponseEntity delete(@PathVariable Long patientId) {
        patientService.delete(patientId);
        return ResponseEntity.ok().build();
    }
}
