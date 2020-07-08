package com.example.spring_security_angular.controller;

import com.example.spring_security_angular.model.User;
import com.example.spring_security_angular.payload.request.LoginRequest;
import com.example.spring_security_angular.repository.UserRepository;
import com.example.spring_security_angular.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*", exposedHeaders = "Authorization")
@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    UserServices userServices;

    @Autowired
    PasswordEncoder encoder;

//    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    private LoginRequest loginRequest;

    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/user")
    public ResponseEntity<?> userAccess() {
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("hello", "Hello user");
        return new ResponseEntity<>(stringStringMap, HttpStatus.OK);
    }

    @GetMapping("/mod")
//    @PreAuthorize("hasRole('MODERATOR')")
    public String moderatorAccess() {
        return "Moderator Board.";
    }

    @GetMapping("/admin")
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<?> adminAccess() {
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("hello", "Hello user");
        return new ResponseEntity<>(stringStringMap, HttpStatus.OK);
    }


    @GetMapping("/users")
    public List<User> listUser() {
        return userServices.findAllUser();
    }

    @PatchMapping("/updateStatus/{id}")
    public User updateUser(@PathVariable long id) {
        User user1 = userServices.findByIdL(id);
        user1.setStatus(true);
        userServices.save(user1);
        return userServices.findByIdL(id);
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userServices.findByIdL(id);
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user) {
        userServices.save(user);
    }


    @PatchMapping("/updatePassword/{id}/password")
    public User updatePassword(@PathVariable long id, @RequestBody String pass) {
        User user1 = userServices.findByIdL(id);
        user1.setPassword(encoder.encode(pass));
        userServices.save(user1);
        return userServices.findByIdL(id);
    }

}
