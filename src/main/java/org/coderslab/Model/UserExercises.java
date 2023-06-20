package org.coderslab.Model;

import lombok.Getter;
import lombok.Setter;
import org.coderslab.Service.ExerciseRepository;
import org.coderslab.Service.UserRepository;
import org.coderslab.Service.WorkoutRepository;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "UserEXERCISES")
public class UserExercises {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rep")
    private Integer rep;

    @Column(name = "time")
    private Integer time;

    @Column(name = "trainingDays")
    private Integer trainingDays;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

    @ManyToOne
    @JoinColumn(name = "workout_id")
    private Workout workout;


}