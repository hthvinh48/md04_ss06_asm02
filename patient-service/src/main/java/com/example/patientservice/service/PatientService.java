package com.example.patientservice.service;

import com.example.patientservice.dto.req.PatientCreateRequest;
import com.example.patientservice.entity.Patient;
import com.example.patientservice.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    public Patient addPatient(PatientCreateRequest patientCreateRequest) {
        Patient patient = new Patient();
        patient.setFullName(patientCreateRequest.getFullName());
        patient.setAddress(patientCreateRequest.getAddress());
        patient.setMedicalHistory(patientCreateRequest.getMedicalHistory());
        return patientRepository.save(patient);
    }
}
