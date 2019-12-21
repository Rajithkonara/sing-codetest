package com.singtel.challenge.controller;

import com.singtel.challenge.animal.Bird;
import com.singtel.challenge.animal.Fish;
import com.singtel.challenge.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/animal")
public class AnimalController {

    private AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping(value = "/fish")
    public Fish fetchFishByName(@RequestParam String name) {
        return animalService.fetchFishByName(name);
    }

    @GetMapping(value = "/bird")
    public Bird fetchBirdByName(@RequestParam String name) {
        return animalService.getBirdByName(name);
    }

}
