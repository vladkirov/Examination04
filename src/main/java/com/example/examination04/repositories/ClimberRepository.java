package com.example.examination04.repositories;

import com.example.examination04.entity.Climber;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClimberRepository extends
        PagingAndSortingRepository<Climber, Long>,
        JpaSpecificationExecutor<Climber> {
}
