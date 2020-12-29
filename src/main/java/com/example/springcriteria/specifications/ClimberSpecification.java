package com.example.springcriteria.specifications;

import com.example.springcriteria.entity.Climber;
import com.example.springcriteria.entity.Climber_;
import org.springframework.data.jpa.domain.Specification;

public class ClimberSpecification {
    public static Specification<Climber> climbersByAge(int from, int by) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.between(root.get(Climber_.AGE), from, by);
    }
}
