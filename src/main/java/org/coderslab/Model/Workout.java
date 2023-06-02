package org.coderslab.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Workout")
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "level")
    private String level;

    @ManyToMany
    private Set<User> User;

    @OneToMany
    private List<UserExercises> UserExercises;
    @ManyToOne
    @JoinColumn(name= "exercise_id")
    private Exercise exercise;
}
