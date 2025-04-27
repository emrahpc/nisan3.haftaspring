package com.acunmedyaJfsr1.BootCampProjects1.service;

import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.CreateInstructorRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.InstructorResponse;

import java.util.List;

public interface InstructorService {
    InstructorResponse add(CreateInstructorRequest request);
    InstructorResponse update(Long id, CreateInstructorRequest request);
    void delete(Long id);
    InstructorResponse getById(Long id);
    List<InstructorResponse> getAll();
}
