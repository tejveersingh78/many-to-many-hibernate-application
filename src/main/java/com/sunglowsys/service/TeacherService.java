package com.sunglowsys.service;

import com.sunglowsys.domain.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher save(Teacher teacher);

    Teacher update(Teacher teacher,Long id);

    List<Teacher> allFind();

    Teacher findById(Long id);

    Teacher delete(Long id);
}
