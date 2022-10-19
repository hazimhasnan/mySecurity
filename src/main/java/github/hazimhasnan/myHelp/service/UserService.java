package github.hazimhasnan.myHelp.service;

import github.hazimhasnan.myHelp.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
public interface UserService {

    public List<UserEntity> getAllUsers();
}
