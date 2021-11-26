package com.company.Entities;

public class Vedomost {
    private Integer id;
    private Integer subjId;
    private Integer teacherId;
    private String date;
    private Integer term;
    private Integer year;
    private Integer groupNum;

    public Vedomost(Integer id, Integer subjId, Integer teacherId, String date, Integer term, Integer year, Integer groupNum) {
        this.id = id;
        this.subjId = subjId;
        this.teacherId = teacherId;
        this.date = date;
        this.term = term;
        this.year = year;
        this.groupNum = groupNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubjId() {
        return subjId;
    }

    public void setSubjId(Integer subjId) {
        this.subjId = subjId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(Integer groupNum) {
        this.groupNum = groupNum;
    }
}
