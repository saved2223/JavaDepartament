package com.company.repository.teacher;


import com.company.Entities.Teacher;
import com.company.repository.StorageUtils.DbUtils;
import com.company.repository.StorageUtils.Executor;
import com.company.repository.StorageUtils.Extractor;

import java.util.ArrayList;
import java.util.List;


public class DbTeacherRepository implements TeacherRepository, DbUtils {

    private Extractor<Teacher> extractor = rs -> {
        List<Teacher> items = new ArrayList<>();
        while (rs.next()) {
            final Teacher item = new Teacher(
                    rs.getString("login"),
                    rs.getString("password"),
                    rs.getString("full_name"),
                    rs.getDate("birth_date"),
                    rs.getString("adress"),
                    rs.getString("position"),
                    rs.getString("titul"),
                    rs.getInt("calary"),
                    rs.getInt("kath_id"),
                    rs.getInt("working_age")
            );
            item.setId(rs.getInt("teacher_id"));
            items.add(item);
        }
        return items;
    };

    @Override
    public String formToDbStyle(Object t) {
        String s = t.toString();
        return String.format("'%s'",s);
    }

    @Override
    public void createTeacher(Teacher teacher) {

    }

    @Override
    public void deleteTeacher(Teacher teacher) {

    }

    @Override
    public Teacher getTeacher(String login, String password) {
        String query = String.format(("select * from teachers where `login` like %s and `password` like %s"),
                formToDbStyle(login), formToDbStyle(password));
        List<Teacher> lst = Executor.getInstance().executeSelect(query, extractor);
        if(lst.isEmpty()){
            return null;
        }
        else {
            return lst.get(0);
        }
    }

    @Override
    public void updatePass(Teacher teacher, String password) {
        String query = String.format("update `teachers` set password = %s where teacher_id = %s",
                formToDbStyle(password), formToDbStyle(teacher.getId()));
        Executor.getInstance().execute(query);
    }

    @Override
    public void updateName(Teacher teacher, String name) {

    }

    @Override
    public void updateAdress(Teacher teacher, String adress) {

    }

    @Override
    public void updatePosition(Teacher teacher, String position) {

    }

    @Override
    public void updateCalary(Teacher teacher, Integer calary) {

    }

    @Override
    public void updateKath(Teacher teacher, Integer kathId) {

    }

    @Override
    public void updateTitle(Teacher teacher, Integer title) {

    }

    @Override
    public void updateWorkingAge(Teacher teacher, Integer workingAge) {

    }
}
