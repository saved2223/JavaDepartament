package com.company.Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends Human {
    private Integer id;
    private Integer depId;
    private Integer kathId;
    private Integer term;
    private Integer groupNum;
    public Student(String login, String password, String name, Date birhDate, String adress, Integer  depId, Integer kathId, Integer term, Integer groupNum) {
        this.depId = depId;
        this.kathId = kathId;
        this.term = term;
        this.groupNum = groupNum;
        this.name = name;
        this.birthDate = birhDate;
        this.adress = adress;
        this.login = login;
        this.password = password;
    }

    @Override
    public List<String> getAll() {
        List<String> lst = new ArrayList<>();
        lst.add(name);
        lst.add(birthDate.toString());
        lst.add(adress);
        lst.add(Integer.toString(depId));
        lst.add(Integer.toString(kathId));
        lst.add(Integer.toString(term));
        lst.add(Integer.toString(groupNum));
        return lst;
    }

    @Override
    public String getLogin() {
        return super.getLogin();
    }

    @Override
    public void setLogin(String login) {
        super.setLogin(login);
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }

    @Override
    public Integer getId() {

        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Date getBirthDate() {
        return super.getBirthDate();
    }

    @Override
    public void setBirthDate(Date birthDate) {
        super.setBirthDate(birthDate);
    }

    @Override
    public String getAdress() {
        return super.getAdress();
    }

    @Override
    public void setAdress(String adress) {
        super.setAdress(adress);
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public int getKathId() {
        return kathId;
    }

    public void setKathId(Integer kath_id) {
        this.kathId = kath_id;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(Integer groupNum) {
        this.groupNum = groupNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", depId=" + depId +
                ", kathId=" + kathId +
                ", term=" + term +
                ", groupNum=" + groupNum +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", adress='" + adress + '\'' +
                '}';
    }
}
