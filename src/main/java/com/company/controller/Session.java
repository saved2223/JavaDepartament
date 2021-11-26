package com.company.controller;

import com.company.Entities.Human;
import com.company.Entities.Student;
import com.company.Entities.Teacher;

public class Session {
    private Teacher teacher;
    private Student student;

    private static Session instance;
    private Session(){
    }

    public void clear(){
        student = null;
        teacher = null;
    }

    public Human getCurr(){
        if(teacher != null){
            return teacher;
        }
        else return student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public static Session getInstance(){
        if(instance == null){
            instance = new Session();
        }
        return instance;
    }
}
