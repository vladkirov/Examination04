package com.example.examination04.specifications;

import com.example.examination04.entity.Climber;
import com.example.examination04.entity.Climber_;
import org.springframework.data.jpa.domain.Specification;

public class ClimberSpecification {
    public static Specification<Climber> climbersByAge(int from, int by) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.between(root.get(Climber_.age), from, by - 1);
    }
}
