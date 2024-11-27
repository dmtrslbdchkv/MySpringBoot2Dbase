package ru.springboot.myspringboot2dbase.controller;

import org.springframework.web.bind.annotation.*;
import ru.springboot.myspringboot2dbase.entity.Student;
import ru.springboot.myspringboot2dbase.model.OperationResult;
import ru.springboot.myspringboot2dbase.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class MyController {

    private final StudentService studentService;

    public MyController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public OperationResult<List<Student>> getAllStudents() {
        return new OperationResult<>(OperationResult.SUCCESS_MESSAGE, studentService.getAllStudents());
    }

    @GetMapping("/{id}")
    public OperationResult<Object> getStudent(@PathVariable("id") int id) {
        return new OperationResult<>(OperationResult.SUCCESS_MESSAGE, studentService.getStudent(id));
    }

    @PostMapping
    public OperationResult<Student> saveStudent(@RequestBody Student student) {
        return new OperationResult<>(OperationResult.SUCCESS_MESSAGE, studentService.saveStudent(student));
    }

    @PutMapping
    public OperationResult<Student> updateStudent(@RequestBody Student student) {
        return new OperationResult<>(OperationResult.SUCCESS_MESSAGE, studentService.saveStudent(student));
    }

    @DeleteMapping("/{id}")
    public OperationResult<Object> deleteStudent(@PathVariable("id") int id) {
        studentService.deleteStudent(id);
        return new OperationResult<>(OperationResult.SUCCESS_MESSAGE, null);
    }

    @ExceptionHandler(Exception.class)
    public OperationResult<String> handleException(Exception e) {
        return new OperationResult<>(OperationResult.ERROR_MESSAGE, e.getMessage());
    }
}
