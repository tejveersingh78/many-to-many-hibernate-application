package com.sunglowsys.service;

import com.sunglowsys.domain.Subject;
import com.sunglowsys.repository.SubjectRepository;
import com.sunglowsys.repository.SubjectRepositoryImpl;

import java.util.List;

public class SubjectServiceImpl implements  SubjectService{
    private static SubjectRepository subjectRepository = new SubjectRepositoryImpl();

    @Override
    public Subject save(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public Subject update(Subject subject, Long id) {
        return subjectRepository.update(subject,id);
    }

    @Override
    public List<Subject> allFind() {
        List<Subject> subjectList = new SubjectRepositoryImpl().allFind();
        return subjectList;
    }

    @Override
    public Subject findById(Long id) {
        return subjectRepository.findById(id);
    }

    @Override
    public Subject deleteById(Long id) {
        return subjectRepository.deleteById(id);
    }
}
