package org.coderslab.Dao;

import org.coderslab.Model.UserExercises;
import org.coderslab.Service.UserExercisesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service // oznacza klasy , skanuje , wstrzykuje zależności.

public class UserExerciseDao {
    private final UserExercisesRepository userExercisesRepository;
    public UserExerciseDao(UserExercisesRepository userExercisesRepository) {
        this.userExercisesRepository = userExercisesRepository;
    }
    public List<UserExercises> getAllUserExercises() {
        return userExercisesRepository.findAll();
    }
    public UserExercises getUserExercisesById(Long id) {
        return userExercisesRepository.findById(id).orElse(null);
    }
    public UserExercises saveUserExercise(UserExercises userExercises) {
        return userExercisesRepository.save(userExercises);
    }
    public void deleteUserExercise(Long id) {
        userExercisesRepository.deleteById(id);
    }

    public UserExercises updateUserExercise(Long id, UserExercises updateUserExercise) {
        UserExercises existingUserExercise = userExercisesRepository.findById(id).orElseThrow(()
                -> new EntityNotFoundException("User exercise with id " + id + "not found"));

        existingUserExercise.setRep(updateUserExercise.getRep());
        existingUserExercise.setTime(updateUserExercise.getTime());
        existingUserExercise.setTrainingDays(updateUserExercise.getTrainingDays());

        return userExercisesRepository.save(existingUserExercise);
    }
}
