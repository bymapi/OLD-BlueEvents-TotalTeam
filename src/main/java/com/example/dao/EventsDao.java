package com.example.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entities.Event;

@Repository
public interface EventsDao extends JpaRepository<Event,Integer>{

    // Paginacion 
        // 1-Sacar los empleados asociados a un evento 
    @Query(value = "select e from Event e left join fetch e.attendee",
    countQuery = "select count(e) from Event e left join e.attendee")

    public Page<Event> findAll(Pageable pageable);

    @Query(value = "select e from Event e left join fetch e.event")
    public List<Event> findAll(Sort sort);

    // Metodo 3
    @Query(value = "select e from Event e left join fetch e.attendee where e.id = :id")
    public Event findById(int id);





    
        
        






}
