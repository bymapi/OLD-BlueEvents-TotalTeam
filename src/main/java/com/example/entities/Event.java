package com.example.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Event implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue
    private int id;

    @NotNull(message = "El nombre no puede ser nulo")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "No ")
    private String title;

    @NotNull
    private Target target;

    private String description;

    private LocalDate startDate;

    private LocalDate endDate;

    private LocalTime startTime;

    private LocalTime endTime;

    private Mode mode;

    // A preguntar pero de momento lo pongo como String

    private String place;

    



    




}
