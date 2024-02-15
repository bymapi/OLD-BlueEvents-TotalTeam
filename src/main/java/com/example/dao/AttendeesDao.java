package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Attendee;



public interface AttendeesDao extends JpaRepository<Attendee,Integer> {

   

}
