package com.sunglowsys.service;

import com.sunglowsys.domain.Teacher;
import com.sunglowsys.repository.TeacherRepository;
import com.sunglowsys.repository.TeacherRepositoryImpl;

import java.util.List;

public class TeacherServiceImpl implements TeacherService{
    private static TeacherRepository teacherRepository = new TeacherRepositoryImpl();

    @Override
    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher update(Teacher teacher, Long id) {
        return teacherRepository.update(teacher,id);
    }

    @Override
    public List<Teacher> allFind() {
        List<Teacher> teacherList = teacherRepository.allFind();
        return teacherList;
    }

    @Override
    public Teacher findById(Long id) {
        return teacherRepository.findById(id);
    }

    @Override
    public Teacher delete(Long id) {
        return teacherRepository.delete(id);
    }
}
