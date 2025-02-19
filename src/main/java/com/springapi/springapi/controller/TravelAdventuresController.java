package com.springapi.springapi.controller;

import com.springapi.springapi.repository.AdventureRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TravelAdventuresController {
    private final AdventureRepository adventureRepository;

    public TravelAdventuresController(AdventureRepository adventureRepository) {
        this.adventureRepository = adventureRepository;
    }
}
