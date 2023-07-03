package org.coderslab.Controller;

import org.coderslab.Dao.UserDao;
import org.coderslab.Dao.UserExerciseDao;
import org.coderslab.Model.Exercise;
import org.coderslab.Model.User;
import org.coderslab.Model.UserExercises;
import org.coderslab.Model.Workout;
import org.coderslab.Service.ExerciseRepository;
import org.coderslab.Service.UserExercisesRepository;
import org.coderslab.Service.UserRepository;
import org.coderslab.Service.WorkoutRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/userExercises")
public class UserExerciseController {

    private final UserExerciseDao userExerciseDao;
    private final ExerciseRepository exerciseRepository;
    private final WorkoutRepository workoutRepository;
    private final UserRepository userRepository;
    private final UserExercisesRepository userExerciseRepository;

    public UserExerciseController(UserExerciseDao userExerciseDao, ExerciseRepository exerciseRepository, WorkoutRepository workoutRepository, UserRepository userRepository, UserExercisesRepository userExerciseRepository) {
        this.userExerciseDao = userExerciseDao;
        this.exerciseRepository = exerciseRepository;
        this.workoutRepository = workoutRepository;
        this.userRepository = userRepository;
        this.userExerciseRepository = userExerciseRepository;
    }
    @GetMapping
    public ResponseEntity<List<UserExercises>> getAllUserExercises() {
        List<UserExercises> userExercises = userExerciseDao.getAllUserExercises();
        return ResponseEntity.ok(userExercises);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserExercises> getUserExerciseById(@PathVariable Long id) {
        UserExercises userExercise = userExerciseDao.getUserExercisesById(id);
        return ResponseEntity.ok(userExercise);
    }
    @GetMapping("/userExercises") // Widok .JSP
    public ModelAndView showUserExercises() {
        List<UserExercises> userExercises = userExerciseRepository.findAll();
        return new ModelAndView("userExercisesList", "userExercises", userExercises);
    }
    @PostMapping("/saveUserExercise")
    public ResponseEntity<UserExercises> saveUserExercise(@RequestBody UserExercises userExercise) {
        UserExercises saveExercise = userExerciseDao.saveUserExercise(userExercise);

        return ResponseEntity.status(HttpStatus.CREATED).body(saveExercise);
    }


    @PutMapping("/{id}")
    public ResponseEntity<UserExercises> updateUserExercise(@PathVariable Long id, @RequestBody UserExercises updatedUserExercise) {
        UserExercises userExercise = userExerciseDao.updateUserExercise(id, updatedUserExercise);
        return ResponseEntity.ok(userExercise);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserExercise(@PathVariable Long id) {
        userExerciseDao.deleteUserExercise(id);
        return ResponseEntity.noContent().build();
    }

}
