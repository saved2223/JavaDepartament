package com.company.service;

import com.company.Entities.Subject;
import com.company.controller.Session;
import com.company.repository.factory.StorageFactory;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService implements ServiceInterface {
private StorageFactory sf;
private Map<Integer, Runnable> actionMap = new HashMap<>();
    public StudentService(StorageFactory sf){
        this.sf = sf;
        actionMap.put(1, this::printGroup);
        actionMap.put(2, this::getSubjects);
    }


    @Override
    public Map<Integer, Runnable> getActionMap() {
        return actionMap;
    }



    @Override
    public List<Subject> getSubjects() {
        return sf.getSubjectStorage().getAllSubjects(Session.getInstance().getStudent().getKathId(), Session.getInstance().getStudent().getTerm());
    }

    public void printGroup(){
        System.out.println("Вы находитесь в группе: " + Session.getInstance().getStudent().getGroupNum());
    }

    @Override
    public void printAll() {
        List<String> lst = Session.getInstance().getStudent().getAll();
        System.out.println("Имя: " + lst.get(0) + "\n" +
                "Дата рождения: " + lst.get(1) + "\n" +
                "Адрес: " + lst.get(2) + "\n" +
                "Номер факультета: " + lst.get(3) + "\n" +
                "Номер кафедры: " + lst.get(4) + "\n" +
                "Семестр: " + lst.get(5) + "\n" +
                "Номер группы: " + lst.get(6));
    }

    @Override
    public void auth(String login, String password) throws SQLException {

        Session.getInstance().setStudent(sf.getStudentStorage().getStudent(login, password));
    }

    @Override
    public int getKey() {
        return 0;
    }

}
