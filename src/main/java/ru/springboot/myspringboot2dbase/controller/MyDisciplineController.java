package ru.springboot.myspringboot2dbase.controller;

import org.springframework.web.bind.annotation.*;
import ru.springboot.myspringboot2dbase.entity.Discipline;
import ru.springboot.myspringboot2dbase.service.DisciplineService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyDisciplineController {

    private final DisciplineService disciplineService;

    public MyDisciplineController(DisciplineService disciplineService) {
        this.disciplineService = disciplineService;
    }

    @GetMapping("/disciplines")
    public List<Discipline> getAllDisciplines() {
        return disciplineService.getAllDisciplines();
    }

    @GetMapping("/disciplines/{id}")
    public Discipline getDiscipline(@PathVariable("id") int id) {
        return disciplineService.getDiscipline(id);
    }

    @PostMapping("/disciplines")
    public Discipline saveDiscipline(@RequestBody Discipline discipline) {
        return disciplineService.saveDiscipline(discipline);
    }

    @PutMapping("/disciplines")
    public Discipline updateDiscipline(@RequestBody Discipline discipline) {
        disciplineService.saveDiscipline(discipline);
        return discipline;
    }

    @DeleteMapping("/disciplines/{id}")
    public void deleteDiscipline(@PathVariable("id") int id) {
        disciplineService.deleteDiscipline(id);
    }
}
