package org.coderslab.Dao;


import org.coderslab.Model.Exercise;
import org.coderslab.Service.ExerciseRepository;
import org.coderslab.exception.NotFoundException;
import org.springframework.stereotype.Service;
import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service // oznacza klasy , skanuje , wstrzykuje zależności.
public class ExerciseDao {
    private final ExerciseRepository exerciseRepository;

    public ExerciseDao(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }
    public List<Exercise> getAllExercises() {
        return exerciseRepository.findAll();
    }
    public Exercise getExerciseById(Long id) {
        return exerciseRepository.findById(id).orElse(null);
    }
    public Exercise getExerciseByName(String name) {
        return exerciseRepository.getExerciseByName(name).orElseThrow(() ->
                new NotFoundException("Exercise with name " + name + " is not found"));
    }
    public Exercise createExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }
    public void deleteExercise(Long id) {
        exerciseRepository.deleteById(id);
    }
    public Exercise updateExercise(Long id, Exercise updateExercise) {
        Exercise existingExercise = exerciseRepository.findById(id).orElseThrow(()
                -> new EntityNotFoundException("Exercise with id " + id + " is not found"));

        existingExercise.setName(updateExercise.getName());
        existingExercise.setDescription(updateExercise.getDescription());
        existingExercise.setInstruction(updateExercise.getInstruction());
        existingExercise.setBodyParts(updateExercise.getBodyParts());
        existingExercise.setLink(updateExercise.getLink());

        return exerciseRepository.save(existingExercise);
    }
}