package com.example.springcriteria.specifications;

import com.example.springcriteria.entity.Mountain;
import com.example.springcriteria.entity.Mountain_;
import org.springframework.data.jpa.domain.Specification;

public class MountainSpecifications {
    public static Specification<Mountain> listByCountry(String country) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get(Mountain_.country), country);
    }
}
