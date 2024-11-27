package ru.springboot.myspringboot2dbase.controller;

import org.springframework.web.bind.annotation.*;
import ru.springboot.myspringboot2dbase.entity.Discipline;
import ru.springboot.myspringboot2dbase.model.OperationResult;
import ru.springboot.myspringboot2dbase.service.DisciplineService;

import java.util.List;

@RestController
@RequestMapping("/api/disciplines")
public class MyDisciplineController {

    private final DisciplineService disciplineService;

    public MyDisciplineController(DisciplineService disciplineService) {
        this.disciplineService = disciplineService;
    }

    @GetMapping
    public OperationResult<List<Discipline>> getAllDisciplines() {
        return new OperationResult<>(OperationResult.SUCCESS_MESSAGE, disciplineService.getAllDisciplines());
    }

    @GetMapping("/{id}")
    public OperationResult<Object> getDiscipline(@PathVariable("id") int id) {
        return new OperationResult<>(OperationResult.SUCCESS_MESSAGE, disciplineService.getDiscipline(id));
    }

    @PostMapping
    public OperationResult<Discipline> saveDiscipline(@RequestBody Discipline discipline) {
        return new OperationResult<>(OperationResult.SUCCESS_MESSAGE, disciplineService.saveDiscipline(discipline));
    }

    @PutMapping
    public OperationResult<Discipline> updateDiscipline(@RequestBody Discipline discipline) {
        return new OperationResult<>(OperationResult.SUCCESS_MESSAGE, disciplineService.saveDiscipline(discipline));
    }

    @DeleteMapping("/{id}")
    public OperationResult<Object> deleteDiscipline(@PathVariable("id") int id) {
        disciplineService.deleteDiscipline(id);
        return new OperationResult<>(OperationResult.SUCCESS_MESSAGE, null);
    }

    @ExceptionHandler(Exception.class)
    public OperationResult<String> handleException(Exception e) {
        return new OperationResult<>(OperationResult.ERROR_MESSAGE, e.getMessage());
    }
}
