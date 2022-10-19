package github.hazimhasnan.myHelp.controller;

import github.hazimhasnan.myHelp.entity.UserEntity;
import github.hazimhasnan.myHelp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private UserService userService;

    @GetMapping("/students")
    public List<UserEntity> getStudents() {
        return userService.getAllUsers();
    }
}
