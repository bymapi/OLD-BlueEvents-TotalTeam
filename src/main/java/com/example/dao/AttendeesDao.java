package com.example.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entities.Attendee;



public interface AttendeesDao extends JpaRepository<Attendee,Integer> {

    /**
     * Vamos a utilizar métodos personalizados,
   
     * 
     * 1. Recupera los asistentes paginados, es decir, de 10 en 10, de 20 en 20, etc
     * 2. Recupera los asistentes ordenados, sin paginación
     * 3. Dado el Global ID de un asistente recuperarle 
     * 
     * Para ello vamos a utilizar el lenguaje HQL (Hybernate Query Language), es muy similar a SQL pero
     * lo que se consulta son las entidades, no las tablas.
     * 
     * Y no se pueden utilizar consultas de SQL nativas porque no soportan la paginacion y el ordenamiento
     */ 

        @Query(value = "select a from Attendee a left join fetch e.event",
        countQuery = "select count(a) from Attendee p left join e.event")
        public Page<Attendee> findAll(Pageable pageable);

        // Método que ordena los productos sin paginación 

        // @Query(value = "select p from Producto p left join fetch p.presentacion")
        // public List<Producto> findAll(Sort sort);

        // Método que recupera el producto con su descripción

        // @Query(value = "select p from Producto p left join fetch p.presentacion where p.id = :id")
        // public Producto findById(int id);

}
