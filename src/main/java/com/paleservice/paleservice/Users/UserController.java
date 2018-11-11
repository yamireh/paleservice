package com.paleservice.paleservice.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository usersRepository;

    public UserController(UserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


    @GetMapping("/all")
    public List<User> all() {
        return usersRepository.findAll();
    }

    @GetMapping("/test")
    public String test() {
        return "Yousef Abu Amireh";
    }

    @GetMapping("/user")
    public User getUserByName(String name) {

        return usersRepository.findByName(name);
    }


    @PostMapping("/user")
    public User createUser(@RequestBody User user) {

        User createdUser = usersRepository.save(user);

        return createdUser;
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable Long id) {

        usersRepository.deleteById(id);

        return "Success";
    }
}
