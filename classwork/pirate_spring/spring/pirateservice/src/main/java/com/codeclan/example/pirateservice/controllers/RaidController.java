package com.codeclan.example.pirateservice.controllers;

import com.codeclan.example.pirateservice.models.Raid;
import com.codeclan.example.pirateservice.repositories.RaidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class RaidController {

    @Autowired
    RaidRepository raidRepository;

    @GetMapping(value = "/raids")
    public List<Raid> getAllRaids() {
        return raidRepository.findAll();
    }

    @GetMapping(value = "/raids/{id}")
    public Optional<Raid> getRaid(@PathVariable Long id) {
        return raidRepository.findById(id);
    }

}
