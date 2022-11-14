package github.hazimhasnan.myHelp.service;

import github.hazimhasnan.myHelp.entity.UserEntity;
import github.hazimhasnan.myHelp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity saveUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<UserEntity> getUserById(Long id) {
        return userRepository.findById(id);
    }
    @Override
    public UserEntity deleteById(Long id) {
        Optional<UserEntity> userEntityOptional = userRepository.findById(id);
        if(userEntityOptional.isEmpty()){
            return null;
        }
        userRepository.deleteById(id);
        return userEntityOptional.get();
    }

    @Override
    public UserEntity patchUser(Long id, UserEntity user) {
        Optional<UserEntity> userEntityOptional = userRepository.findById(id);
        if (userEntityOptional.isEmpty()){
            return null;
        }
        userEntityOptional.get().setName(user.getName());
        return userEntityOptional.get();
    }

    @Override
    public UserEntity getUserByName(String name) {
        return null;
    }

}
