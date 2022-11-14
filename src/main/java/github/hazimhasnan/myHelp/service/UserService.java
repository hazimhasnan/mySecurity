package github.hazimhasnan.myHelp.service;

import github.hazimhasnan.myHelp.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface UserService {

    public List<UserEntity> getAllUsers();

    public UserEntity saveUser(UserEntity user);

    public Optional<UserEntity> getUserById(Long id);

    public UserEntity deleteById(Long id);

    public UserEntity patchUser(Long id, UserEntity user);

    public UserEntity getUserByName(String name);
}
