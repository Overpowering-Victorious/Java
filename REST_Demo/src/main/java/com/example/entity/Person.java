package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {
	
	@Id
	@GeneratedValue
	protected int id;
	
	@NotBlank(message = "Name cannot be blank")
	@NotEmpty(message = "Name shouldn't be empty")
	@NotNull(message = "Name cannot be null")
	@Pattern(regexp = "^[a-zA-Z]{3,15}$", message = "Name should only contain letters and should be of 3 to 15 character long.")
	protected String name;	
	
}
