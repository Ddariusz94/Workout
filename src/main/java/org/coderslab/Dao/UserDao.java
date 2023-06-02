package org.coderslab.Dao;

import org.coderslab.Model.User;
import org.coderslab.Service.UserRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@Primary
public class UserDao {
    private final UserRepository userRepository;
    public UserDao(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    public User findUserByName(String name) {
        return userRepository.findByName(name);
    }
    public User createUser(User user) {
        return userRepository.save(user);
    }
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
    public User updateUser(Long id, User updatedUser) {
        User existingUser = userRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException("User with id: " + id + " is not found"));

        existingUser.setName(updatedUser.getName());
        existingUser.setGender(updatedUser.getGender());
        existingUser.setAge(updatedUser.getAge());
        existingUser.setWeight(updatedUser.getWeight());

        return userRepository.save(existingUser);
    }

}