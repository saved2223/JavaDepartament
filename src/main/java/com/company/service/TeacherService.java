package com.company.service;

import com.company.Entities.Kathedra;
import com.company.Entities.Student;
import com.company.Entities.Subject;
import com.company.controller.Session;
import com.company.repository.factory.StorageFactory;

import java.util.*;

public class TeacherService implements ServiceInterface {
    private StorageFactory sf;
    private Map<Integer, Runnable> actionMap = new HashMap<>();
    public TeacherService(StorageFactory sf) {
        this.sf = sf;
        actionMap.put(1, this::printStudentsSameKath);
        actionMap.put(4, this::changeStudKathedra);
        actionMap.put(5, this::getSubjects);//добавить предмет, удалить предмет, изменить предмет
    }

    public void createSubject(Integer kathId, String name, Integer hours, Integer isExam, Integer term){
        Subject subject = new Subject(kathId, name, hours, isExam, term);
        sf.getSubjectStorage().createSubject(subject);
    }


    @Override
    public Map<Integer, Runnable> getActionMap() {
        return actionMap;
    }

    private void printStudentsSameKath(){
        System.out.println("Список студентов с вашей кафедры");
        for (Student i: sf.getStudentStorage().getAllStuds(Session.getInstance().getTeacher().getKathId())){
            System.out.println(i.toString());
        }
    }


    public void createStudent(String name, String birthDate, String adress, Integer depId, Integer kathId, Integer term, String login, String password, Integer groupNum) {
        Student student = new Student(null, null, null, null, null, null, null, null, null);
        student.setLogin(login);
        student.setPassword(password);
        student.setName(name);
        student.setBirthDate(java.sql.Date.valueOf(birthDate));
        student.setAdress(adress);
        student.setDepId(depId);
        student.setKathId(kathId);
        student.setTerm(term);
        student.setGroupNum(groupNum);
        sf.getStudentStorage().createStudent(student);
    }

    @Override
    public List<Subject> getSubjects() {
        return sf.getSubjectStorage().getAllSubjectsForTeacher(Session.getInstance().getTeacher().getId());
    }

    @Override
    public void printAll() {
        List<String> lst = Session.getInstance().getTeacher().getAll();
        System.out.println("Имя: " + lst.get(0) + "\n" +
                           "Дата рождения: " + lst.get(1) + "\n" +
                           "Адрес: " + lst.get(2) + "\n" +
                           "Позиция: " + lst.get(3) + "\n" +
                           "Титул: " + lst.get(4) + "\n" +
                           "Зарплата: " + lst.get(5) + "\n" +
                           "Номер кафедры: " + lst.get(6) + "\n" +
                           "Стаж работы: " + lst.get(7));
    }
    private void showAllStuds(){
        List<Student> lst = sf.getStudentStorage().getAllStuds();
        for(Student i: lst) {
            System.out.println(i.toString());
        }
    }

    public void changeStudKathedra(){
        System.out.println("выберите ID студента, которого хотите перевести на другую кафедру");
        showAllStuds();
        Scanner s = new Scanner(System.in);
        Student stud = sf.getStudentStorage().getStudent(s.nextInt());
        if(stud == null) System.out.println("Неверный ID");
        else {
            System.out.println("Введите ID кафедры, на которую хотите перевести");
            sf.getStudentStorage().updateKath(stud,s.nextInt());
            System.out.println("Студент был успешно переведен!");
        }
    }



    public void removeStudent(Integer id){
        sf.getStudentStorage().removeStudent(id);
    }

    @Override
    public void auth(String login, String password) {
        Session.getInstance().setTeacher(sf.getTeacherStorage().getTeacher(login, password));
    }

    @Override
    public int getKey() {
        return 0;
    }
}
