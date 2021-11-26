package com.company.Entities;

public class Subject {
    private Integer id;
    private Integer kath_id;
    private String name;
    private Integer hours;
    private Integer isExam;
    private Integer term;

    public Subject( Integer kath_id,  String name, Integer hours, Integer isExam, Integer term) {
        this.kath_id = kath_id;
        this.name = name;
        this.hours = hours;
        this.isExam = isExam;
        this.term = term;
    }

    public Integer getKath_id() {
        return kath_id;
    }

    public void setKath_id(Integer kath_id) {
        this.kath_id = kath_id;
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

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getExam() {
        return isExam;
    }

    public void setExam(Integer exam) {
        isExam = exam;
    }

    public String getIsExam(){
        if(isExam == 1) return "Да";
        else return "Нет";
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", hours=" + hours +
                ", isExam=" + isExam +
                ", term=" + term
                ;
    }
}
