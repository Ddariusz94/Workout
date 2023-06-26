package org.coderslab.Service;

import org.coderslab.Model.UserExercises;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserExercisesRepository extends JpaRepository<UserExercises, Long> {
}

