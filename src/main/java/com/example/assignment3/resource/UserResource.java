package com.example.assignment3.resource;

import com.example.assignment3.model.Album;
import com.example.assignment3.model.User;
import com.example.assignment3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserResource {
    @Autowired
    public UserService u2;
    @PostMapping("/user")
    public User saveUser(@RequestBody User u1)
    {
        return u2.saveUser(u1);

    }
    @GetMapping("/user")
    public List<User> getUser()
    {
        return u2.getUser();

    }
@PutMapping("/user")
    public User updateUser(@RequestBody User u1)
{

    return u2.updateUser(u1);
}
@DeleteMapping
    public void deleteUser(@RequestParam(name="userId")String userId)
{
    u2.deleteUser(userId);

}









}
