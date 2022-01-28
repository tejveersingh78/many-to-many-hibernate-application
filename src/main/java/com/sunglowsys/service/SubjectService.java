package com.sunglowsys.service;

import com.sunglowsys.domain.Subject;

import java.util.List;

public interface SubjectService {
    Subject save(Subject subject);

    Subject update(Subject subject,Long id);

    List<Subject> allFind();

    Subject findById(Long id);

    Subject deleteById(Long id);
}
