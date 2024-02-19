package com.example.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
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
@Table(name = "events")

public class Event implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @UniqueElements
    private int idGlobal;

    @NotNull(message = "Must not be empty")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Write alphabetic letters only ")
    private String title;

    @NotNull
    private Target target;

    @NotNull(message = "Must not be empty")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Write alphabetic letters only ")
    private String description;

    @NotNull(message = "Must not be empty")
    @DateTimeFormat(pattern = "dd-MM-YYYY")
    private LocalDate startDate;

    @NotNull(message = "Must not be empty")
    @DateTimeFormat(pattern = "dd-MM-YYYY")
    private LocalDate endDate;

    @NotNull(message = "Must not be empty")
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime startTime;

    @NotNull(message = "Must not be empty")
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime endTime;
    

    @NotNull(message = "Must not be empty")
    private Mode mode;

    // A preguntar pero de momento lo pongo como String
    @NotNull(message = "Must not be empty")
    private String place;

     @ManyToMany(fetch = FetchType.LAZY,
      cascade = {
          CascadeType.PERSIST,
          CascadeType.MERGE
      },

      mappedBy = "events" )
    @JsonIgnore
    //private Set<Attendee> attendees = new HashSet<>();
    private List<Attendee> attendees;

    



    




}
