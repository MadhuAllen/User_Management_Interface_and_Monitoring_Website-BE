package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUsers() {
        List<User> users = userRepo.findAll();
        return users;
    }

    public Optional<User> getUser(Long id) {
        return userRepo.findById(id);
    }

    public User addUser(User user) {
        User user1 = new User();
        userRepo.save(user);
        return user;
    }

    public String DeleteUser(Long id) {
        Optional<User> user = userRepo.findById(id);
        userRepo.delete(user.get());
        return "the Deleted Id -> "+id;
    }

    public User updateUser(Long id, User user) {
        User existingUser= new User(id,user);
        userRepo.save(existingUser);
        return existingUser;
    }
}
