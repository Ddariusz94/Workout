package org.coderslab.Controller;

import lombok.RequiredArgsConstructor;
import org.coderslab.Dao.ExerciseDao;
import org.coderslab.Dao.UserDao;
import org.coderslab.Model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/USER")
public class UserController {
    private final UserDao userDao;
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userDao.getAllUsers();
        return ResponseEntity.ok(users);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
        User user = userDao.getUserById(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/name/{username}")
    public ResponseEntity<User> findUserByName(@PathVariable String username) {
        User user = userDao.findUserByName(username);
        if(user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/saveUser")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userDao.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }
    @PutMapping("/update/{id}") // metoda do sprawdzenia
    public ResponseEntity<User> updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        User updateUser = userDao.updateUser(id, user);
        if (updateUser != null) {
            return ResponseEntity.ok(updateUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long userId) {
        userDao.deleteUser(userId);
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/form")
    public String showUserForm(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("exercise", userDao.getAllExercises()); // Pobierz wszystkie ćwiczenia z bazy danych
        model.addAttribute("workout", userDao.getAllWorkouts()); // Pobierz wszystkie treningi z bazy danych
        return "userForm";
    }
    @GetMapping("/usersView")
    public ModelAndView showUserList() {
        List<User> users = userDao.getAllUsers();
        ModelAndView modelAndView = new ModelAndView("userList");
        modelAndView.addObject("users", users);
        return modelAndView;
    }

}