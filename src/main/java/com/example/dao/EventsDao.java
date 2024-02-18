package com.example.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entities.Event;

@Repository
public interface EventsDao extends JpaRepository<Event,Integer>{

    // Paginacion 
        // 1-Sacar los empleados asociados a un evento 
    @Query(value = "select attendee from Attendee attendee left join fetch attendee.event",
    countQuery = "select count(attendee) from Attendee attendee left join attendee.Attendee")

    public Page<Event> findAll(Pageable pageable);




    
        
        






}
