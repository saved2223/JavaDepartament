package com.company.repository.teacher;


import com.company.Entities.Teacher;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IMTeacherRepository implements TeacherRepository {
    private List<Teacher> lst = new ArrayList<>();
    private Teacher igor = new Teacher("logT1", "passT1", "Igor", new Date(1972, 1, 1), "pushkono", "prepod", "professor", 10000, 1, 15);
    public IMTeacherRepository(){
        lst.add(igor);
    }


    @Override
    public void createTeacher(Teacher teacher) {

    }

    @Override
    public void deleteTeacher(Teacher teacher) {

    }

    @Override
    public Teacher getTeacher(String login, String password) {
        for(Teacher teach: lst){
            if((teach.getLogin().equals(login)) && (teach.getPassword().equals(password)))
                return teach;
        }
        return null;
    }

    @Override
    public void updatePass(Teacher teacher, String password) {

    }

    @Override
    public void updateName(Teacher teacher, String name) {

    }

    @Override
    public void updateAdress(Teacher teacher, String adress) {

    }

    @Override
    public void updatePosition(Teacher teacher, String position) {

    }

    @Override
    public void updateCalary(Teacher teacher, Integer calary) {

    }

    @Override
    public void updateKath(Teacher teacher, Integer kathId) {

    }

    @Override
    public void updateTitle(Teacher teacher, Integer title) {

    }

    @Override
    public void updateWorkingAge(Teacher teacher, Integer workingAge) {

    }
}
