package github.hazimhasnan.myHelp.controller;

import github.hazimhasnan.myHelp.entity.UserEntity;
import github.hazimhasnan.myHelp.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    private final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/students")
    public List<UserEntity> getUsers() {
        LOGGER.info("Get Students Controller");
        return userService.getAllUsers();
    }

    @PostMapping("/students")
    @Transactional
    public UserEntity saveUser(@RequestBody UserEntity user) {
        LOGGER.info("POST one student Controller");
        return userService.saveUser(user);
    }
}
