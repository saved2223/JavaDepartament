package com.company.Entities;




public class Departament {
    private Integer id;

    private String name;
    private String headName;
    private String headRoom;
    private String headPhone;

    public Departament(String name, String headName, String headRoom, String headPhone){
        this.headName = headName;
        this.name = name;
        this.headPhone = headPhone;
        this.headRoom = headRoom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    public String getHeadRoom() {
        return headRoom;
    }

    public void setHeadRoom(String headRoom) {
        this.headRoom = headRoom;
    }

    public String getHeadPhone() {
        return headPhone;
    }

    public void setHeadPhone(String headPhone) {
        this.headPhone = headPhone;
    }
}
