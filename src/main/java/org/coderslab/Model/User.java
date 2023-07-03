package org.coderslab.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "USER")
@JsonSerialize //Adnotacja @JsonSerialize jest używana w kontekście biblioteki Jackson,
// która jest popularną biblioteką do przekształcania obiektów Java na format JSON i odwrotnie.
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Pattern(regexp = "^[a-zA-Z]+$", message = "Name should contain only letters")
    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;
    @NotBlank(message = "Age should not be empty")
    @Pattern(regexp = "\\d+", message = "Age should contain only digits")
    @Column(name = "age")
    private String age;

    @Digits(integer = 3, fraction = 2)
    @Column(name = "weight")
    private Double weight;

    @ManyToMany
    @JoinTable(
            name = "user_workout",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "workout_id")
    )
    @JsonIgnore
    private List<Workout> workouts;
    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

    @ManyToOne
    @JoinColumn(name = "workout_id")
    private Workout workout;

}