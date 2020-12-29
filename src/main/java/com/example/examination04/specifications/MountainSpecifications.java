package com.example.examination04.specifications;

import com.example.examination04.entity.Mountain;
import com.example.examination04.entity.Mountain_;
import org.springframework.data.jpa.domain.Specification;

public class MountainSpecifications {
    public static Specification<Mountain> listByCountry(String country) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get(Mountain_.country), country);
    }
}
