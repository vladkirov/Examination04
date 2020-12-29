package com.example.examination04.entity;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.*;

@Entity
public class Climber extends Identity {
    @Getter
    @Setter
    @NotBlank
    @Size(min = 3)
    @Column(nullable = false, length = 50)
    private String name;

    @Getter
    @Setter
    @Size(min = 5)
    @NotBlank
    private String address;

    @Getter
    @Setter
    @Min(value = 18)
    @Positive
    @Column(nullable = false)
    private int age;

    @Getter
    @Setter
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    private GroupAdventure group;

    @Override
    public String toString() {
        return "Climber{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", group=" + group +
                '}';
    }
}
