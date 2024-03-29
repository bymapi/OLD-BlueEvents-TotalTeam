package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {

    List<Event> findEventsByAttendeesId(int AttendeeId);
    
}
