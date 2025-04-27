package com.acunmedyaJfsr1.BootCampProjects1.repository;

import com.acunmedyaJfsr1.BootCampProjects1.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
