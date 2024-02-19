// package com.example.controllers;
// import java.util.ArrayList;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import com.example.entities.Event;
// import com.example.repository.eventRepository;



// @RestController
// @RequestMapping("/api/events")
// public class EventsController {

   
//     private final EventRepository eventRepository;

//     public ResponseEntity<List<Event>> getAllEvents(@RequestParam(required = false) String title) {
//         List<Event> events = new ArrayList<Event>();
    
//         if (title == null)
//           eventRepository.findAll().forEach(events::add);
//         else
//           eventRepository.findByTitleContaining(title).forEach(events::add);
    
//         if (events.isEmpty()) {
//           return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//         }
    
//         return new ResponseEntity<>(events, HttpStatus.OK);
//       }
    
//       @GetMapping("/events/{id}")
//       public ResponseEntity<Event> getEventById(@PathVariable("id") long id) {
//         Event event = eventRepository.findById(id)
//             .orElseThrow(() -> new ResourceNotFoundException("Not found Event with id = " + id));
    
//         return new ResponseEntity<>(event, HttpStatus.OK);
//       }
    
//       @PostMapping("/events")
//       public ResponseEntity<Event> createEvent(@RequestBody Event event) {
//         Event _event = eventRepository.save(new Event(event.getTitle(), event.getDescription(), true));
//         return new ResponseEntity<>(_event, HttpStatus.CREATED);
//       }
    
//       @PutMapping("/events/{id}")
//       public ResponseEntity<Event> updateEvent(@PathVariable("id") long id, @RequestBody Event event) {
//         Event _event = eventRepository.findById(id)
//             .orElseThrow(() -> new ResourceNotFoundException("Not found Event with id = " + id));
    
//         _event.setTitle(event.getTitle());
//         _event.setDescription(event.getDescription());
//         _event.setPublished(event.isPublished());
        
//         return new ResponseEntity<>(eventRepository.save(_event), HttpStatus.OK);
//       }
    
//       @DeleteMapping("/events/{id}")
//       public ResponseEntity<HttpStatus> deleteEvent(@PathVariable("id") long id) {
//         eventRepository.deleteById(id);
        
//         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//       }
    
//       @DeleteMapping("/events")
//       public ResponseEntity<HttpStatus> deleteAllEvents() {
//         eventRepository.deleteAll();
        
//         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//       }
    
//       @GetMapping("/events/published")
//       public ResponseEntity<List<Event>> findByPublished() {
//         List<Event> events = eventRepository.findByPublished(true);
    
//         if (events.isEmpty()) {
//           return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//         }
        
//         return new ResponseEntity<>(events, HttpStatus.OK);
//       }
//     }


