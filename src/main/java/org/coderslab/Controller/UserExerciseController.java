package org.coderslab.Controller;

import org.coderslab.Dao.UserExerciseDao;
import org.coderslab.Model.UserExercises;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userExercises")
public class UserExerciseController {

    private final UserExerciseDao userExerciseDao;

    public UserExerciseController(UserExerciseDao userExerciseDao) {
        this.userExerciseDao = userExerciseDao;
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

    @PostMapping
    public ResponseEntity<UserExercises> addUserExercise(@RequestBody UserExercises userExercise) {
        UserExercises createdUserExercise = userExerciseDao.saveUserExercise(userExercise);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUserExercise);
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
