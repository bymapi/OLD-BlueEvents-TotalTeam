package com.example.entities;


import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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

    //@NotNull(message = "The name of the attendee cannot be null")
    //@NotEmpty(message = "The name cannot be empty")
    
    private String name;

   // @NotNull(message = "The surname of the attendee cannot be null")
    //@NotEmpty(message = "The surname cannot be empty")
    // @NotNull(message = "The surname of the attendee cannot be null")
    // @NotEmpty(message = "The surname cannot be empty")
    private String surname;

    //@Size(min = 5, max = 9, message = "the number of characters of this id cannot be less than 5 or more than 9")
   // @Size(min = 5, max = 9, message = "the number of characters of this id cannot be less than 5 or more than 9")
    private int globalId;


    // @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    private Event event;

    private String mail;
    private Options options;


}
