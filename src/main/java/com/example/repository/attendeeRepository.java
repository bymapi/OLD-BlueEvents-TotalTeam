package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Attendee;

public interface attendeeRepository extends JpaRepository <Attendee, Integer>{
    // El nombre de la interfaz debe comenzar por mayúscula
    
    List<Attendee> findAttendeesByEventsId(int eventId);
}
