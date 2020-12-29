package com.example.examination04.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class GroupAdventure extends Identity {
    @Getter
    @Setter
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Mountain.class)
    private Mountain mountain;

    @Getter
    @Setter
    @NotEmpty
    @OneToMany(mappedBy = "group", fetch = FetchType.LAZY)
    private Set<Climber> climbers = new HashSet<>();

    @Getter
    @Setter
    private boolean isOpen;

    @Getter
    @Setter
    @FutureOrPresent
    @Column(nullable = false)
    private LocalDate date;

    @Getter
    @Setter
    @Min(value = 2)
    @Column(nullable = false)
    private int duration;

    @Override
    public String toString() {
        return "GroupAdventure{" +
                "mountain=" + mountain +
                ", climbers=" + climbers +
                ", isOpen=" + isOpen +
                ", date=" + date +
                ", duration=" + duration +
                '}';
    }
}
