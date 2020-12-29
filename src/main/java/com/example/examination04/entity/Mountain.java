package com.example.examination04.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.*;

@Entity
public class Mountain extends Identity {
    @Getter
    @Setter
    @Size(min = 4)
    @NotBlank
    @Column(nullable = false, length = 50)
    private String name;

    @Getter
    @Setter
    @Size(min = 4)
    @NotBlank
    @Column(nullable = false, length = 30)
    private String country;

    @Getter
    @Setter
    @Min(value = 100)
    @Positive
    @Column(nullable = false)
    private int height;

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", height=" + height +
                '}';
    }
}
