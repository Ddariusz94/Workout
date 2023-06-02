package org.coderslab.Dao;

import org.coderslab.Model.Workout;
import org.coderslab.Service.WorkoutRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service // oznacza klasy , skanuje , wstrzykuje zależności.

public class WorkoutDao {
    private final WorkoutRepository workoutRepository;

    public WorkoutDao(WorkoutRepository WorkoutRepository) {
        this.workoutRepository = WorkoutRepository;
    }

    public List<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }

    public Workout getWorkoutById(Long id) {
        return workoutRepository.findById(id).orElse(null);
    }

    public Workout createWorkout(Workout workout) {
        return workoutRepository.save(workout);
    }

    public Workout updateWorkout(Long id, Workout updatedWorkout) {
        Workout existingWorkout = workoutRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException("Workout with id: " + id + " is not found"));

        if (updatedWorkout.getName() != null) {
            existingWorkout.setName(updatedWorkout.getName());
        }
        if (updatedWorkout.getDescription() != null) {
            existingWorkout.setDescription(updatedWorkout.getDescription());
        }
        if (updatedWorkout.getLevel() != null) {
            existingWorkout.setLevel(updatedWorkout.getLevel());
        }

        return workoutRepository.save(existingWorkout);
    }

    public boolean deleteWorkout(Long id) {
        if (workoutRepository.existsById(id)) {
            workoutRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
