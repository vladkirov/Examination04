package com.example.examination04.controllers;

import com.example.examination04.entity.GroupAdventure;
import com.example.examination04.repositories.GroupAdventureRepository;
import com.example.examination04.specifications.GroupAdventureSpecifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/group_adv")
public class GroupAdventureController {
    private GroupAdventureRepository groupAdventureRepository;

    @Autowired
    public GroupAdventureController(GroupAdventureRepository groupAdventureRepository) {
        this.groupAdventureRepository = groupAdventureRepository;
    }

    @GetMapping("/opened")
    public Iterable<GroupAdventure> getOpenedGroups() {
        return groupAdventureRepository.findAll(GroupAdventureSpecifications.opened());
    }

    @GetMapping("/by_mountain")
    public Iterable<GroupAdventure> getGroupsByMountain(@PathVariable String mountain) {
        return groupAdventureRepository.findAll(GroupAdventureSpecifications.byMountain(mountain));
    }
}
