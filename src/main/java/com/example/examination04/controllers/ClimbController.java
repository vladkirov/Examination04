package com.example.examination04.controllers;

import com.example.examination04.entity.Climber;
import com.example.examination04.repositories.ClimberRepository;
import com.example.examination04.specifications.ClimberSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/climbers")
public class ClimbController {
    private ClimberRepository climberRepository;

    @Autowired
    public ClimbController (ClimberRepository climberRepository) {
        this.climberRepository = climberRepository;
    }

    @GetMapping("/by_age/{from}_{by}")
    public Iterable<Climber> getClimbersByAge(@PathVariable int from, @PathVariable int by) {
        Iterable<Climber> climbers = climberRepository.findAll(ClimberSpecification.climbersByAge(from, by));
        System.out.println(climbers);
        return climbers;
    }
}
