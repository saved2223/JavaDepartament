package com.company.Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Teacher extends Human{
    private Integer kathId;
    private String position;
    private String title;
    private Integer calary;
    private Integer workingAge;

    public Teacher(String login, String password, String name, Date birhDate, String adress, String position, String title, Integer calary,  Integer kathId, Integer workingAge){
        this.kathId = kathId;
        this.name = name;
        this.birthDate = birhDate;
        this.adress = adress;
        this.login = login;
        this.password = password;
        this.position = position;
        this.title = title;
        this.calary = calary;
        this.workingAge = workingAge;
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
        return super.getId();
    }

    @Override
    public void setId(Integer id) {
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

    @Override
    public List<String> getAll() {
        List<String> lst = new ArrayList<>();
        lst.add(name);
        lst.add(birthDate.toString());
        lst.add(adress);
        lst.add(position);
        lst.add(title);
        lst.add(Integer.toString(calary));
        lst.add(kathId.toString());
        lst.add(Integer.toString(workingAge));
        return  lst;
    }

    public Integer getKathId() {
        return kathId;
    }

    public void setKathId(Integer kathId) {
        this.kathId = kathId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCalary() {
        return calary;
    }

    public void setCalary(Integer calary) {
        this.calary = calary;
    }

    public Integer getWorkingAge() {
        return workingAge;
    }

    public void setWorkingAge(Integer workingAge) {
        this.workingAge = workingAge;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "kathId=" + kathId +
                ", position='" + position + '\'' +
                ", title='" + title + '\'' +
                ", calary=" + calary +
                ", workingAge=" + workingAge +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", adress='" + adress + '\'' +
                '}';
    }
}
