package com.acunmedyaJfsr1.BootCampProjects1.service.impl;

import com.acunmedyaJfsr1.BootCampProjects1.entity.Instructor;
import com.acunmedyaJfsr1.BootCampProjects1.repository.InstructorRepository;
import com.acunmedyaJfsr1.BootCampProjects1.service.InstructorService;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.CreateInstructorRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.InstructorResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class InstructorServiceImpl implements InstructorService {
    private final InstructorRepository instructorRepository;

    @Override
    public InstructorResponse add(CreateInstructorRequest request) {
        Instructor instructor = new Instructor();
        instructor.setUsername(request.getUsername());
        instructor.setFirstName(request.getFirstName());
        instructor.setLastName(request.getLastName());
        instructor.setDateOfBirth(request.getDateOfBirth());
        instructor.setNationalIdentity(request.getNationalIdentity());
        instructor.setEmail(request.getEmail());
        instructor.setPassword(request.getPassword());
        instructor.setCompanyName(request.getCompanyName());

        Instructor savedInstructor = instructorRepository.save(instructor);
        return mapToResponse(savedInstructor);
    }

    @Override
    public InstructorResponse update(Long id, CreateInstructorRequest request) {
        Instructor instructor = instructorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Instructor not found"));

        instructor.setUsername(request.getUsername());
        instructor.setFirstName(request.getFirstName());
        instructor.setLastName(request.getLastName());
        instructor.setDateOfBirth(request.getDateOfBirth());
        instructor.setNationalIdentity(request.getNationalIdentity());
        instructor.setEmail(request.getEmail());
        instructor.setPassword(request.getPassword());
        instructor.setCompanyName(request.getCompanyName());

        Instructor updatedInstructor = instructorRepository.save(instructor);
        return mapToResponse(updatedInstructor);
    }

    @Override
    public void delete(Long id) {
        instructorRepository.deleteById(id);
    }

    @Override
    public InstructorResponse getById(Long id) {
        Instructor instructor = instructorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Instructor not found"));
        return mapToResponse(instructor);
    }

    @Override
    public List<InstructorResponse> getAll() {
        return instructorRepository.findAll().stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    private InstructorResponse mapToResponse(Instructor instructor) {
        InstructorResponse response = new InstructorResponse();
        response.setId(instructor.getId());
        response.setUsername(instructor.getUsername());
        response.setFirstName(instructor.getFirstName());
        response.setLastName(instructor.getLastName());
        response.setDateOfBirth(instructor.getDateOfBirth());
        response.setNationalIdentity(instructor.getNationalIdentity());
        response.setEmail(instructor.getEmail());
        response.setCompanyName(instructor.getCompanyName());
        return response;
    }
}
