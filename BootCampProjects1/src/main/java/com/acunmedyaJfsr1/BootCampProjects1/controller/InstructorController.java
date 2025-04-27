package com.acunmedyaJfsr1.BootCampProjects1.controller;

import com.acunmedyaJfsr1.BootCampProjects1.service.InstructorService;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.request.CreateInstructorRequest;
import com.acunmedyaJfsr1.BootCampProjects1.service.dto.response.InstructorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/instructors")
public class InstructorController {
    private final InstructorService instructorService;

    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public InstructorResponse createInstructor(@RequestBody CreateInstructorRequest request) {
        return instructorService.add(request);
    }

    @PutMapping("/{id}")
    public InstructorResponse updateInstructor(@PathVariable Long id, @RequestBody CreateInstructorRequest request) {
        return instructorService.update(id, request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteInstructor(@PathVariable Long id) {
        instructorService.delete(id);
    }

    @GetMapping("/{id}")
    public InstructorResponse getInstructor(@PathVariable Long id) {
        return instructorService.getById(id);
    }

    @GetMapping
    public List<InstructorResponse> getAllInstructors() {
        return instructorService.getAll();
    }
}