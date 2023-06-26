package org.coderslab.Controller;

import javassist.NotFoundException;
import org.coderslab.Dao.ExerciseDao;
import org.coderslab.Model.Exercise;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("exercises")
public class ExerciseController {

    private final ExerciseDao exerciseDao;


    public ExerciseController(ExerciseDao exerciseDao) {
        this.exerciseDao = exerciseDao;
    }

    @GetMapping
    public ResponseEntity<List<Exercise>> getAllExercises() {
        List<Exercise> exercise = exerciseDao.getAllExercises();
        return ResponseEntity.ok(exercise);
    }

    @GetMapping("{id}")
    public ResponseEntity<Exercise> getExerciseById(@PathVariable Long id) {
        Exercise exercise = exerciseDao.getExerciseById(id);
        if (exercise != null) {
            return ResponseEntity.ok(exercise);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Exercise> createExercise(@RequestBody Exercise exercise) {
        Exercise createdExercise = exerciseDao.createExercise(exercise);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdExercise);
    }

    @PutMapping("{id}")
    public ResponseEntity<Exercise> updateExercise(@PathVariable Long id, @RequestBody Exercise exercise) {
        Exercise updatedExercise = exerciseDao.updateExercise(id, exercise);
        if (updatedExercise != null) {
            return ResponseEntity.ok(updatedExercise);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping(value="/name/{name}", produces = MediaType.TEXT_HTML_VALUE + ";charset=UTF-8")
    public ModelAndView getExerciseByName(@PathVariable String name) {
        Exercise exercise = exerciseDao.getExerciseByName(name);
        return new ModelAndView("exercises", Map.of("exercise", exercise));
    }
    @GetMapping(value = "/{id}/details")
    public ModelAndView showExerciseDetails(@PathVariable Long id) {
        Exercise exercise = exerciseDao.getExerciseById(id);
        return new ModelAndView("exerciseDetails", "exercise", exercise);
    }
    @GetMapping(value = "/{id}/name-instruction")
    public ModelAndView getExerciseNameAndInstruction(@PathVariable Long id) {
        Exercise exercise = exerciseDao.getExerciseById(id);
        ModelAndView modelAndView = new ModelAndView("exerciseNameInstruction");
        modelAndView.addObject("exercise", exercise);
        return modelAndView;
    }
}
