package com.example.springcriteria.repositories;

import com.example.springcriteria.entity.GroupAdventure;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupAdventureRepository extends
        PagingAndSortingRepository<GroupAdventure, Long>,
        JpaSpecificationExecutor<GroupAdventure> {
}
