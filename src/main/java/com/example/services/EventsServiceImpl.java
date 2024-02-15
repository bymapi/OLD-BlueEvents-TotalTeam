package com.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dao.EventsDao;
import com.example.entities.Event;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class EventsServiceImpl implements EventsServices {

    private final EventsDao eventsDao;

    @Override
    public List<Event> findAll() {

        return eventsDao.findAll();
        
    }

    @Override
    public Event findById(int id) {
        
        return eventsDao.findById(id).get();
    }

    @Override
    public void save(Event event) {

        eventsDao.save(event);
        
    }

    @Override
    public void delete(Event event) {
        eventsDao.delete(event);
        
    }

}
