package com.example.patientservice.controller;

import com.example.patientservice.dto.req.PatientCreateRequest;
import com.example.patientservice.entity.Patient;
import com.example.patientservice.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/patients")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @PostMapping
    public ResponseEntity<Patient> createPatient(@RequestBody PatientCreateRequest request){
        Patient createdPatient = patientService.addPatient(request);
        return ResponseEntity.ok(createdPatient);
    }
}
