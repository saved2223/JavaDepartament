package com.company.repository.student;

import com.company.Entities.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IMStudentStorage implements StudentStorage{
    Student vasya = new Student("log1", "pass1", "Vasya",  new Date(1996, 3, 12), "kukuevo", 1, 1, 1, 1);
    Student petya = new Student("log2", "pass2", "Petya",  new Date(1996, 3, 12), "kukuevo", 1, 1, 1, 1);
    Student natasha = new Student("log3", "pass3", "Natasha",  new Date(1996, 3, 12), "kukuevo", 1, 2, 1, 1);
    private List<Student> lst = new ArrayList<>();
    public IMStudentStorage(){
        lst.add(vasya);
        lst.add(petya);
        lst.add(natasha);
    }

    @Override
    public Student getStudent(Integer id) {
        return null;
    }

    @Override
    public void removeStudent(Integer id) {

    }

    @Override
    public List<Student> getAllStuds(Integer kath_id) {
        return null;
    }

    @Override
    public List<Student> getAllStuds() {
        return lst;
    }

    @Override
    public void createStudent(Student student){

    }

    @Override
    public Student getStudent(String login, String password) {
        for(Student stud: lst){
            if((stud.getLogin().equals(login)) && (stud.getPassword().equals(password)))
                return stud;
        }
        return null;
    }

    @Override
    public void updatePass(Student student, String password) {

    }

    @Override
    public void updateName(Student student, String name) {

    }

    @Override
    public void updateAdress(Student student, String adress) {

    }

    @Override
    public void updateDep(Student student, Integer depId) {

    }

    @Override
    public void updateKath(Student student, Integer kathId) {

    }

    @Override
    public void updateTerm(Student student, Integer term) {

    }

    @Override
    public void updateGroup(Student student, Integer group) {

    }
}
