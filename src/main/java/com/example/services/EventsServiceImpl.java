package com.example.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.dao.EventsDao;
import com.example.entities.Event;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class EventsServiceImpl implements EventsServices {
    

    private final EventsDao eventsDao;

    @Override
    public Page<Event> findAll(Pageable pageable) {
        
        return eventsDao.findAll(pageable);
    }

    @Override
    public List<Event> findAll(Sort sort) {

        return eventsDao.findAll(sort);
    }

    @Override
    public List<Event> findAll() {

      return eventsDao.findAll();
    }

    @Override
    public Event findById(int id) {

        return eventsDao.findById(id);
    }

    @Override
    public Event save(Event event) {
        
        return eventsDao.save(event);
        
    }

    @Override
    public void delete(Event event) {
        
      eventsDao.delete(event);
    }



}
