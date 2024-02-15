package com.example.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.dao.AttendeesDao;
import com.example.entities.Attendee;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AttendeesServiceImpl implements AttendeesService{
    
    private final AttendeesDao attendeeDao;

    @Override
    public Page<Attendee> findAll(Pageable pageable) {
        
        return attendeeDao.findAll(pageable);

    }

    @Override
    public List<Attendee> findAll(Sort sort) {
        
        return attendeeDao.findAll(sort);

    }

    @Override
    public Attendee findById(int id) {
        
        return attendeeDao.findById(id);
    }

    @Override
    public Attendee save(Attendee attendee) {

        return attendeeDao.save(attendee);
    }

    @Override
    public void delete(Attendee attendee) {
        
        attendeeDao.delete(attendee);
    }

    @Override
    public List<Attendee> findAll() {
        
        return attendeeDao.findAll();
        
    }

}


