package ru.springboot.myspringboot2dbase.service;

import org.springframework.stereotype.Service;
import ru.springboot.myspringboot2dbase.dao.DisciplineDao;
import ru.springboot.myspringboot2dbase.entity.Discipline;

import java.util.List;

@Service
public class DisciplineServiceImpl implements DisciplineService {

    private final DisciplineDao disciplineDao;

    public DisciplineServiceImpl(DisciplineDao disciplineDao) {
        this.disciplineDao = disciplineDao;
    }

    @Override
    public List<Discipline> getAllDisciplines() {
        return disciplineDao.getAllDisciplines();
    }

    @Override
    public Discipline saveDiscipline(Discipline discipline) {
        return disciplineDao.saveDiscipline(discipline);
    }

    @Override
    public Discipline getDiscipline(int id) {
        return disciplineDao.getDiscipline(id);
    }

    @Override
    public void deleteDiscipline(int id) {
        disciplineDao.deleteDiscipline(id);
    }
}