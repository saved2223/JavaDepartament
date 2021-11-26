package com.company.Entities;

public class Group {
    private Integer id;
    private Integer number;
    private Integer enterYear;

    public Group(Integer number, Integer enterYear){
        this.enterYear = enterYear;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Integer getEnterYear() {
        return enterYear;
    }

    public void setEnterYear(int enterYear) {
        this.enterYear = enterYear;
    }
}
