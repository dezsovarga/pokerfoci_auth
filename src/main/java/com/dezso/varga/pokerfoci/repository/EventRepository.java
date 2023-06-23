package com.dezso.varga.pokerfoci.repository;

import com.dezso.varga.pokerfoci.domain.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventRepository extends CrudRepository<Event, Long> {

    List<Event> findAll();
}