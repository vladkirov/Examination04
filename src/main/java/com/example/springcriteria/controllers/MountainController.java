package com.example.springcriteria.controllers;

import com.example.springcriteria.entity.Mountain;
import com.example.springcriteria.repositories.MountainRepository;
import com.example.springcriteria.specifications.MountainSpecifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mountains")
public class MountainController {
    private MountainRepository mountainRepository;

    @Autowired
    public MountainController(MountainRepository mountainRepository) {
        this.mountainRepository = mountainRepository;
    }

    @GetMapping("/by_country/{country}")
    public Iterable<Mountain> getMountainsByCountry(@PathVariable String country) {
        Iterable<Mountain> mountains = mountainRepository.findAll(MountainSpecifications.listByCountry(country));
        System.out.println(mountains);
        return mountains;
    }
}
