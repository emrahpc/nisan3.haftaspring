package com.acunmedyaJfsr1.BootCampProjects1.entity;

import com.acunmedyaJfsr1.BootCampProjects1.core.entity.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "instructors")
public class Instructor extends User {
    private String companyName;

    public Instructor() {
        super();
    }

    public Instructor(Long id, String username, String firstName, String lastName, LocalDate dateOfBirth, String nationalIdentity, String email, String password, String companyName) {
        super(id, username, firstName, lastName, dateOfBirth, nationalIdentity, email, password);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
