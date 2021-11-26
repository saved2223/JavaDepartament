package com.company.Entities;

public class Kathedra {
    private Integer id;
    private Integer depId;
    private String name;
    private String headName;
    private String roomNum;
    private String phoneNum;

    public Kathedra(Integer depId, String name, String headName, String roomNum, String phoneNum) {
        this.id = id;
        this.depId = depId;
        this.name = name;
        this.headName = headName;
        this.roomNum = roomNum;
        this.phoneNum = phoneNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
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

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
