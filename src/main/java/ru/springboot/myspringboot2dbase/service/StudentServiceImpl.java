package ru.springboot.myspringboot2dbase.service;

import org.springframework.stereotype.Service;
import ru.springboot.myspringboot2dbase.dao.StudentDao;
import ru.springboot.myspringboot2dbase.entity.Student;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentDao.saveStudent(student);
    }

    @Override
    public Student getStudent(int id) {
        return studentDao.getStudent(id);
    }

    @Override
    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }
}
