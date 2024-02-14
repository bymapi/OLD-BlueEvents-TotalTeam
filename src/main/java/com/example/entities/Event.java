package com.example.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
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

    private String title;

    private Target target;

    private String description;

    private LocalDate starDate;

    private LocalDate enDate;

    private LocalTime starTime;

    private LocalTime endTime;

    

    




}
