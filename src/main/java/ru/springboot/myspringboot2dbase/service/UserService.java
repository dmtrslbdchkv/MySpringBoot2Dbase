package ru.springboot.myspringboot2dbase.service;

import ru.springboot.myspringboot2dbase.dto.UserDto;
import ru.springboot.myspringboot2dbase.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
