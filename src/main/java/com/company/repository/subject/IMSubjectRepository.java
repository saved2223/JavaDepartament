package com.company.repository.subject;

import com.company.Entities.Subject;

import java.util.ArrayList;
import java.util.List;

public class IMSubjectRepository implements SubjectRepository {
    private List<Subject> lst = new ArrayList();
    private Subject math = new Subject(1, "Математика", 58, 1, 1);
    private Subject phys = new Subject(1, "Физика", 21, 1, 1);
    private Subject oop = new Subject(1, "OOP", 1488, 0, 2);
    public IMSubjectRepository(){
        lst.add(math);
        lst.add(phys);
        lst.add(oop);
    }

    @Override
    public List<Subject> getAllSubjects(int kath_id) {
        return null;
    }

    @Override
    public List<Subject> getAllSubjects(int kath_id, int term) {
        return null;
    }

    public List<Subject> getAllSubjects(){
        return lst;
    }

    @Override
    public void createSubject(Subject subject) {

    }

    @Override
    public List<Subject> getAllSubjectsForTeacher(int teacher_id) {
        return null;
    }

    @Override
    public void deleteSubject(Integer id) {

    }

    @Override
    public void deleteSubject(Subject subject) {

    }

    @Override
    public Subject getSubject(Integer id) {
        return null;
    }

    @Override
    public void changeHours(Subject subject, Integer hours) {

    }

    @Override
    public void changeName(Subject subject, String name) {

    }

    @Override
    public void changeTerm(Subject subject, Integer term) {

    }

    @Override
    public void changeIsExam(Subject subject, Boolean isExam) {

    }


}
