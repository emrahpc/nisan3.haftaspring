package com.acunmedyaJfsr1.BootCampProjects1.entity;

import com.acunmedyaJfsr1.BootCampProjects1.core.entity.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "employees")
public class Employee extends User {
    private String position;

    public Employee() {
        super();
    }

    public Employee(Long id, String username, String firstName, String lastName, LocalDate dateOfBirth, String nationalIdentity, String email, String password, String position) {
        super(id, username, firstName, lastName, dateOfBirth, nationalIdentity, email, password);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
