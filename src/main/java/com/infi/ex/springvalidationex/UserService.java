package com.infi.ex.springvalidationex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User saveUserData(UserDto user) {
        User newuser = new User();
        newuser.setName(user.getName());
        newuser.setAge(user.getAge());
        newuser.setGender(user.getGender());
        newuser.setMobile(user.getMobile());
        newuser.setEmail(user.getEmail());
        newuser.setNationality(user.getNationality());
        return userRepository.save(newuser);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(int id) throws UserNotFoundException {
        User user = userRepository.findByUserId(id);

        if (user != null) {
            return user;

        } else {
          throw new UserNotFoundException("the serach is not present.." + id);
        }

    }

}
