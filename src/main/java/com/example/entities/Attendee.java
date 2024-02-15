package com.example.entities;


import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "attendees")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Attendee implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

  
    @NotEmpty(message = "The name cannot be empty")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Write alphabetic letters only ")
    private String name;

    
    @NotEmpty(message = "The surname cannot be empty")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Write alphabetic letters only ")
    private String surname;

    //@Size(min = 5, max = 9, message = "the number of characters of this id cannot be less than 5 or more than 9")
    private int globalId;


    @JoinTable(name = "event_seq",
    joinColumns = { @JoinColumn(name = "attendee_id") },
    inverseJoinColumns = { @JoinColumn(name = "event_id") })


    private List <Event> events;
    

    @ManyToMany(fetch = FetchType.LAZY,
    cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
    })


    
    @NotEmpty(message = "The field mail cannot be empty")
    private String mail;

    @NotEmpty(message = "The profile cannot be empty")
    private Options options;


}
