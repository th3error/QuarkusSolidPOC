package org.acme.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employees")
@DynamicUpdate
public class Employee extends PanacheEntity {
    public String first_name;
    public String last_name;
    @NotEmpty(message = "username can not be empty")
    @Size(min = 3, max = 50, message = "username length has to be between 3 and 50 characters")
    public String username;
    @NotEmpty(message = "email can not be empty")
    @Email(message = "please enter a valid email")
    public String email;

    public String phone_number;

    public String zip_code;

    public String status;

    public String role;


}
