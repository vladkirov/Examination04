package com.example.examination04.repositories;

import com.example.examination04.entity.GroupAdventure;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupAdventureRepository extends
        PagingAndSortingRepository<GroupAdventure, Long>,
        JpaSpecificationExecutor<GroupAdventure> {
}
