package com.acunmedyaJfsr1.BootCampProjects1.repository;

import com.acunmedyaJfsr1.BootCampProjects1.entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long> {
}
