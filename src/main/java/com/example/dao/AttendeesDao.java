package com.example.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entities.Attendee;



public interface AttendeesDao extends JpaRepository<Attendee,Integer> {


        @Query(value = "select a from Attendee a left join fetch a.event",
        countQuery = "select count(a) from Attendee a left join a.event")
        public Page<Attendee> findAll(Pageable pageable);

        // Método que ordena los asistentes sin paginación 

        @Query(value = "select a from Attendee a left join fetch a.event")
        public List<Attendee> findAll(Sort sort);

        // Método que recupera el asistente con su evento

        @Query(value = "select a from Attendee a left join fetch a.event where a.id = :id")
        public Attendee findById(int id);

        

}
