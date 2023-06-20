package org.coderslab.Controller;
import org.coderslab.Dao.UserExerciseDao;
import org.coderslab.Model.Exercise;
import org.coderslab.Model.User;
import org.coderslab.Model.UserExercises;
import org.coderslab.Model.Workout;
import org.coderslab.Service.ExerciseRepository;
import org.coderslab.Service.UserRepository;
import org.coderslab.Service.WorkoutRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/userExercisesForm")
public class UserExercisesForm {

    private final UserExerciseDao userExerciseDao;
    private final ExerciseRepository exerciseRepository;
    private final WorkoutRepository workoutRepository;
    private final UserRepository userRepository;

    public UserExercisesForm(UserExerciseDao userExerciseDao, ExerciseRepository exerciseRepository, WorkoutRepository workoutRepository, UserRepository userRepository) {
        this.userExerciseDao = userExerciseDao;
        this.exerciseRepository = exerciseRepository;
        this.workoutRepository = workoutRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/form")
    public String showUserExercisesForm(Model model) {
        model.addAttribute("userExercise", new UserExercises());
        return "userExerciseForm";
    }

    @PostMapping("/form")
    public String addUserExercise(@ModelAttribute("userExercise") UserExercises userExercise,
                                  @RequestParam("exercise") Long exerciseId,
                                  @RequestParam("user") Long userId,
                                  @RequestParam("workout") Long workoutId,
                                  @RequestParam("rep") Integer rep,
                                  @RequestParam("time") Integer time,
                                  @RequestParam("trainingDays") Integer trainingDays) {
        Exercise exercise = exerciseRepository.findById(exerciseId).orElse(null);
        User user = userRepository.findById(userId).orElse(null);
        Workout workout = workoutRepository.findById(workoutId).orElse(null);

        userExercise.setExercise(exercise);
        userExercise.setUser(user);
        userExercise.setWorkout(workout);
        userExercise.setRep(rep);
        userExercise.setTime(time);
        userExercise.setTrainingDays(trainingDays);

        UserExercises createdUserExercise = userExerciseDao.saveUserExercise(userExercise);
        // Przekierowanie użytkownika do nowego widoku po dodaniu ćwiczenia
        return "index";
    }

    @GetMapping("/success")
    public String showSuccessPage(@RequestParam("id") Long id, Model model) {
        UserExercises userExercise = userExerciseDao.getUserExercisesById(id);
        model.addAttribute("userExercise", userExercise);
        return "registration-sucess";
    }
}