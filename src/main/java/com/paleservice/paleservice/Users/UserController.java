package com.paleservice.paleservice.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


    @GetMapping("/create")
    public List<User> users() {
        /*
        Users users = new Users();
        users.setId(1);
        users.setName("Sam");
        users.setSalary(3400);
        users.setTeamName("Development");

        usersRepository.save(users);

        return usersRepository.findAll();
        */
        return null;
    }
}
