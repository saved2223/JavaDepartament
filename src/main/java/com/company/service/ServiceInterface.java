package com.company.service;

import com.company.Entities.Human;
import com.company.Entities.Subject;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ServiceInterface {
    Map<Integer, Runnable> getActionMap();
    void auth(String login, String password) throws SQLException;
    int getKey();
    void printAll();
    List<Subject> getSubjects();
}
