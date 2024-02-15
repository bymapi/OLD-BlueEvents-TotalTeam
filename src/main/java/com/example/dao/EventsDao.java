package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Event;

@Repository
public interface EventsDao extends JpaRepository<Event,Integer>{

}
