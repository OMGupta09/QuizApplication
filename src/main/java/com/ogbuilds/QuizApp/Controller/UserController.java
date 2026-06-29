package com.ogbuilds.QuizApp.Controller;

import com.ogbuilds.QuizApp.Model.User;
import com.ogbuilds.QuizApp.Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private UserService userService;

    public UserController(UserService userService)
    {
        this.userService=userService;
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody User user)
    {
       return userService.registerUser(user);
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") int id)
    {
        return userService.getUserById(id);
    }

    public List<User> getUsers()
    {
        return userService.getUsers();
    }


    @GetMapping("/users/{username}")
    public User getUser(@PathVariable("username") String username)
    {
        return userService.getUser(username);
    }

}
