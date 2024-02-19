package com.example.helpers;

import java.time.LocalDate;
import java.time.LocalTime;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.entities.Attendee;
import com.example.entities.Event;
import com.example.entities.Mode;
import com.example.entities.Options;
import com.example.entities.Target;
import com.example.services.AttendeesService;
import com.example.services.EventsServices;

@Configuration
public class LoadSampleData {

    @Bean
    public CommandLineRunner saveSampleData(AttendeesService attendeesService, 
    EventsServices eventsServices){

        return datos ->{

            eventsServices.save(Event.builder()
            .title("French for non-native speakers")
            .target(Target.INTERNS)
            .description("French classes, level B2")
            .startDate(LocalDate.of(2024, 03, 10))
            .endDate(LocalDate.of(2024, 03, 10))
            .startTime(LocalTime.of(10, 30))
            .endTime(LocalTime.of(12, 30))
            .mode(Mode.ONLINE)
            .place("Blue offices, Valence")
            //.attendees(attendeesService.findById(1))
            .build());

            eventsServices.save(Event.builder()
            .title("Pets and owners get-together")
            .target(Target.BOOTCAMP)
            .description("Social event aming to get to know each other and make new friends, with two or even more legs")
            .startDate(LocalDate.of(2024, 04, 07))
            .endDate(LocalDate.of(2024, 04, 07))
            .startTime(LocalTime.of(17, 10))
            .endTime(LocalTime.of(18, 15))
            .mode(Mode.PRESENTIAL)
            .place("Turia Park, Valence")
            //.attendees(attendeesService.findById(1))
            .build());

            eventsServices.save(Event.builder()
            .title("Hackathon")
            .target(Target.INTERNS)
            .description("Hackathon, first edition")
            .startDate(LocalDate.of(2024, 05, 17))
            .endDate(LocalDate.of(2024, 05, 14))
            .startTime(LocalTime.of(9, 00))
            .endTime(LocalTime.of(17, 30))
            .mode(Mode.MIXED)
            .place("Blue offices, Valence")
            //.attendees(attendeesService.findById(1))
            .build());


            attendeesService.save(Attendee.builder()
            .name("Alfredo")
            .surname("Adame")
            .globalId(10808939)
            //.events(eventsServices.findById(1))
            .mail("alfrea@blue.com")
            .options(Options.EMPLOYEE)
            .build());

            attendeesService.save(Attendee.builder()
            .name("Mariana")
            .surname("Urbina")
            .globalId(43166546)
            //.events(eventsServices.findById(1))
            .mail("mariu@blue.com")
            .options(Options.BOOTCAMPER)
            .build());

            attendeesService.save(Attendee.builder()
            .name("Salvador")
            .surname("Gomez")
            .globalId(25308939)
            //.events(eventsServices.findById(1))
            .mail("Salgo@blue.com")
            .options(Options.EMPLOYEE)
            .build());

            attendeesService.save(Attendee.builder()
            .name("Edith")
            .surname("Herrera")
            .globalId(10659939)
            //.events(eventsServices.findById(1))
            .mail("Ediierr@blue.com")
            .options(Options.BOOTCAMPER)
            .build());

            attendeesService.save(Attendee.builder()
            .name("Joseph")
            .surname("Britapas")
            .globalId(19673239)
            //.events(eventsServices.findById(1))
            .mail("jobrit@blue.com")
            .options(Options.BOOTCAMPER)
            .build());

            attendeesService.save(Attendee.builder()
            .name("Eva")
            .surname("Toro")
            .globalId(46163485)
            //.events(eventsServices.findById(1))
            .mail("EvaT@blue.com")
            .options(Options.EMPLOYEE)
            .build());
        };
    }

}
