package com.acunmedyaJfsr1.BootCampProjects1.entity;

import com.acunmedyaJfsr1.BootCampProjects1.core.entity.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "applicants")
public class Applicant extends User {
    private String about;

    public Applicant() {
        super();
    }

    public Applicant(Long id, String username, String firstName, String lastName, LocalDate dateOfBirth, String nationalIdentity, String email, String password, String about) {
        super(id, username, firstName, lastName, dateOfBirth, nationalIdentity, email, password);
        this.about = about;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}