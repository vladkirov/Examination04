package com.example.springcriteria.repositories;

import com.example.springcriteria.entity.Mountain;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MountainRepository extends
        PagingAndSortingRepository<Mountain, Long>,
        JpaSpecificationExecutor<Mountain> {
}
