package com.example.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.entities.Event;

public interface EventsServices {

    public Page<Event> findAll(Pageable pageable);

    public List<Event> findAll(Sort sort);

    public List<Event> findAll();

    public Event findById(int id);

    public Event save(Event event);

    public void delete(Event event);
    // Esta bien

}
