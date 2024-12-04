package ru.springboot.myspringboot2dbase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.springboot.myspringboot2dbase.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
