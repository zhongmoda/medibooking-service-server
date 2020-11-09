package com.medibooking.bookingserviceserver.controllers;

import com.medibooking.bookingserviceserver.dtos.doctor.DoctorGetDto;
import com.medibooking.bookingserviceserver.dtos.doctor.DoctorPostDto;
import com.medibooking.bookingserviceserver.dtos.doctor.DoctorPutDto;
import com.medibooking.bookingserviceserver.entities.Doctor;
import com.medibooking.bookingserviceserver.services.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorService doctorService;

    @PostMapping
    public ResponseEntity<Object> add(@RequestBody DoctorPostDto doctorPostDto) {
        DoctorGetDto doctorGetDto = doctorService.create(doctorPostDto);
        return ResponseEntity.ok(doctorGetDto);
    }

    @GetMapping
    public ResponseEntity<List<Doctor>> find(){
        List<Doctor> list = doctorService.getAllDoctors();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{doctorId}")
    public ResponseEntity<DoctorGetDto> findById(@PathVariable UUID doctorId){
        return ResponseEntity.ok(doctorService.findDoctorById(doctorId));
    }

    @GetMapping("search")
    public ResponseEntity<DoctorGetDto> findByUserName(@RequestParam String doctorUserName) {
        return ResponseEntity.ok(doctorService.findDoctorByUserName(doctorUserName));
    }

    @PutMapping("/{doctorId}")
    public ResponseEntity<DoctorGetDto> update(@PathVariable UUID doctorId, @RequestBody DoctorPutDto doctorPutDto){
        return ResponseEntity.ok(doctorService.modify(doctorId, doctorPutDto));
    }

    @DeleteMapping("/{doctorId}")
    public ResponseEntity delete (@PathVariable UUID doctorId){
        doctorService.delete(doctorId);
        return ResponseEntity.ok().build();
    }
}
