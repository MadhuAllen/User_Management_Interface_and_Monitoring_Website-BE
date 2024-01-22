package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "user/{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping(value = "add_user")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping(value = "update_user/{id}")
    public User updateUser(@RequestBody User user, @PathVariable Long id) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping(value = "delete_user/{id}")
    public String DeleteUser(@PathVariable Long id) {
        return userService.DeleteUser(id);
    }



}
