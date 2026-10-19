package com.example.patientservice.dto.req;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PatientCreateRequest {
    private String fullName;
    private String address;
    private String medicalHistory;
}
