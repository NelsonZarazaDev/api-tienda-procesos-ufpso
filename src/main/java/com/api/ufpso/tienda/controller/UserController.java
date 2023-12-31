package com.api.ufpso.tienda.controller;

import com.api.ufpso.tienda.model.User;
import com.api.ufpso.tienda.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Validated
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("users/{id}")
    public ResponseEntity<User>  getUserById(@PathVariable Long id){
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @PostMapping("users")
    public ResponseEntity<User> create(@Valid @RequestBody User user){

        return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
    }

    @PutMapping("users/{id}")
    public ResponseEntity<User> update(@Valid @RequestBody User user, @PathVariable Long id){
        return new ResponseEntity<>(userService.updateUser(user,id),HttpStatus.OK);

    }
    @DeleteMapping("users/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id ) {
        return new ResponseEntity(userService.deleteUser(id),HttpStatus.NO_CONTENT);
    }

    @GetMapping("users")
    public ResponseEntity <List<User>> findAll(){
        return ResponseEntity.ok(userService.findAllUsers());
    }

}
