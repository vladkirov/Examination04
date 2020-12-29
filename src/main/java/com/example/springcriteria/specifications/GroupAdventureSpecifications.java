package com.example.springcriteria.specifications;

import com.example.springcriteria.entity.GroupAdventure;
import com.example.springcriteria.entity.GroupAdventure_;
import com.example.springcriteria.entity.Mountain;
import com.example.springcriteria.entity.Mountain_;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;

public class GroupAdventureSpecifications {
    public static Specification<GroupAdventure> opened() {
        return (root, query, criteriaBuilder) -> criteriaBuilder.isTrue(root.get(GroupAdventure_.isOpen));
    }

    public static Specification<GroupAdventure> byMountain(String mountainName) {
        return (root, query, criteriaBuilder) -> {
            Join<GroupAdventure, Mountain> adventureMountainJoin = root.join(GroupAdventure_.mountain, JoinType.INNER);
            return criteriaBuilder.equal(adventureMountainJoin.get(Mountain_.name), mountainName);
        };
    }
}
