package com.example.services;

import java.util.List;

import com.example.entities.Event;

public interface EventsServices {

    public List<Event> findAll();

    public Event findById(int id);

    public void save(Event event);

    public void delete(Event event);

}
