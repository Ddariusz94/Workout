package org.coderslab.Controller;

import lombok.RequiredArgsConstructor;
import org.coderslab.Dao.UserExerciseDao;
import org.coderslab.Model.*;
import org.coderslab.Service.ExerciseRepository;
import org.coderslab.Service.UserRepository;
import org.coderslab.Service.WorkoutRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@RequestMapping("/userExercisesForm")
@RequiredArgsConstructor
public class UserExercisesForm {

    private final UserExerciseDao userExerciseDao;
    private final ExerciseRepository exerciseRepository;
    private final WorkoutRepository workoutRepository;
    private final UserRepository userRepository;

    @ModelAttribute("users")
    public Collection<User> modelUsers() {
        return userRepository.findAll();
    }

    @ModelAttribute("workouts")
    public Collection<Workout> modelWorkouts() {
        return workoutRepository.findAll();
    }

    @ModelAttribute("exercises")
    public Collection<Exercise> modelExercises() {
        return exerciseRepository.findAll();
    }

    @GetMapping("/form")
    public String showUserExercisesForm(Model model) {
        model.addAttribute("userExercise", new UserExercises());
        return "userExerciseForm";
    }

   @PostMapping("/form")
   public String addUserExercise(
            @ModelAttribute("userExercise") UserExercises userExercise
    ) {
        userExerciseDao.saveUserExercise(userExercise);
        return "userExerciseForm";
    }

    @GetMapping("/success")
    public String showSuccessPage(@RequestParam("id") Long id, Model model) {
        UserExercises userExercise = userExerciseDao.getUserExercisesById(id);
        model.addAttribute("userExercise", userExercise);
        return "registration-sucess";
    }
}