package com.company.repository.student;

import com.company.Entities.Student;
import com.company.repository.StorageUtils.DbUtils;
import com.company.repository.StorageUtils.Extractor;
import com.company.repository.StorageUtils.Executor;


import java.util.ArrayList;
import java.util.List;

public class DbStudentStorage implements StudentStorage, DbUtils {

    private Extractor<Student> extractorForSelect = rs -> {
        List<Student> items = new ArrayList<>();
        while (rs.next()) {
            final Student item = new Student(
                    rs.getString("login"),
                    rs.getString("password"),
                    rs.getString("full_name"),
                    rs.getDate("birth_date"),
                    rs.getString("adress"),
                    rs.getInt("fac_id"),
                    rs.getInt("kath_id"),
                    rs.getInt("term"),
                    rs.getInt("group_number")
            );
            item.setId(rs.getInt("stud_id"));
            items.add(item);
        }
        return items;
    };

    @Override
    public void removeStudent(Integer id) {
        String query = String.format("delete from `students` where stud_id = %s", formToDbStyle(id));
        Executor.getInstance().execute(query);
    }

    @Override
    public List<Student> getAllStuds(Integer kath_id) {
        String query = String.format("select * from students where `kath_id` like %s", formToDbStyle(kath_id.toString()));
        return Executor.getInstance().executeSelect(query, extractorForSelect);
    }

    @Override
    public List<Student> getAllStuds() {
        String query = "select * from students";
        return Executor.getInstance().executeSelect(query, extractorForSelect);
    }

    public void createStudent(Student student){
        String query = String.format("insert into `students`" + "values (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s)",
                                    null,
                                    formToDbStyle(student.getName()), formToDbStyle(student.getBirthDate()),
                                    formToDbStyle(student.getAdress()), student.getDepId(),
                                    student.getKathId(), student.getTerm(),
                                    formToDbStyle(student.getLogin()), formToDbStyle(student.getPassword()),
                                    student.getGroupNum());
        Executor.getInstance().execute(query);
    }

    @Override
    public String formToDbStyle(Object t){
        String s = t.toString();
        return String.format("'%s'",s);
    }

    @Override
    public Student getStudent(Integer id) {
        String query = String.format("select * from students where stud_id = %s", formToDbStyle(id));
        List<Student> lst = Executor.getInstance().executeSelect(query, extractorForSelect);
        if(lst.isEmpty()){
            return null;
        }
        else {
            return lst.get(0);
        }
    }

    @Override
    public Student getStudent(String login, String password) {
        String query = String.format(("select * from students where `login` like %s and `password` like %s"),
                formToDbStyle(login), formToDbStyle(password));
        List<Student> lst = Executor.getInstance().executeSelect(query, extractorForSelect);
        return lst.get(0);
    }


    @Override
    public void updatePass(Student student, String password) {
        String query = String.format("update `students` set password = %s where stud_id = %s",
                formToDbStyle(password), formToDbStyle(student.getId()));
        Executor.getInstance().execute(query);
    }

    @Override
    public void updateName(Student student, String name) {

    }

    @Override
    public void updateAdress(Student student, String adress) {

    }

    @Override
    public void updateDep(Student student, Integer depId) {

    }

    @Override
    public void updateKath(Student student, Integer kathId) {
        String query = String.format("update `students` set kath_id = %s where stud_id = %s",
                                    formToDbStyle(kathId), formToDbStyle(student.getId()));
        Executor.getInstance().execute(query);
    }

    @Override
    public void updateTerm(Student student, Integer term) {

    }

    @Override
    public void updateGroup(Student student, Integer group) {

    }
}
