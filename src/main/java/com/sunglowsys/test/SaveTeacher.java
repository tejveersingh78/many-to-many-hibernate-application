package com.sunglowsys.test;

import com.sunglowsys.domain.Subject;
import com.sunglowsys.domain.Teacher;
import com.sunglowsys.repository.SubjectRepositoryImpl;
import com.sunglowsys.repository.TeacherRepositoryImpl;
import com.sunglowsys.service.SubjectService;
import com.sunglowsys.service.SubjectServiceImpl;
import com.sunglowsys.service.TeacherServiceImpl;

import java.util.HashSet;
import java.util.Set;

public class SaveTeacher {
    public static void main(String[] args) {
        Subject subject1 = new Subject("Mathematics","M33s");
        Subject subject2 = new Subject("English","E233S");
        Subject subject3 = new Subject("Science","S3634s");
        SubjectService subjectService = new SubjectServiceImpl();
        subjectService.save(subject1);
        subjectService.save(subject2);
        subjectService.save(subject3);

        Set<Subject> subjects = new HashSet<>();



        Teacher teacher1 = new Teacher("Kaptan","Singh","kp@gmail.com","8959474979","Guest-Teacher");
        teacher1.setSubjects(subjects);
        Teacher teacher =   new TeacherRepositoryImpl().save(teacher1);
        System.out.println(teacher);
        Teacher teacher2 = new Teacher("Suresh","Chandra","sc@gmail.com","0839839089","Teacher");
        teacher2.setSubjects(subjects);
        Teacher teachera =   new TeacherRepositoryImpl().save(teacher2);
        System.out.println(teachera);




    }
}
