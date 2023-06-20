package org.coderslab.Service;

import org.coderslab.Model.Exercise;
import org.coderslab.Model.User;
import org.coderslab.Model.Workout;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);
    @Query("SELECT e FROM Exercise e")
    List<Exercise> getAllExercises();

    @Query("SELECT w FROM Workout w")
    List<Workout> getAllWorkouts();

}
