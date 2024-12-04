package ru.springboot.myspringboot2dbase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.springboot.myspringboot2dbase.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
