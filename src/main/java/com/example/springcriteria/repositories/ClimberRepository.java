package com.example.springcriteria.repositories;

import com.example.springcriteria.entity.Climber;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClimberRepository extends
        PagingAndSortingRepository<Climber, Long>,
        JpaSpecificationExecutor<Climber> {
}
