package com.company.repository.subject;

import com.company.Entities.Subject;
import com.company.repository.StorageUtils.DbUtils;
import com.company.repository.StorageUtils.Executor;
import com.company.repository.StorageUtils.Extractor;


import java.util.ArrayList;
import java.util.List;

public class DbSubjectRepository implements SubjectRepository, DbUtils {

    private Extractor<Subject> extractor = rs -> {
        List<Subject> items = new ArrayList<>();
        while (rs.next()) {
            final Subject item = new Subject(
                    rs.getInt("kath_id"),
                    rs.getString("name"),
                    rs.getInt("hours"),
                    rs.getInt("is_exam"),
                    rs.getInt("term")
            );
            item.setId(rs.getInt("subj_id"));
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
    public List<Subject> getAllSubjectsForTeacher(int teacher_id) {
        String query = String.format("SELECT lessons.subj_id, kath_id, name, hours, is_exam, lessons.term from `lessons` INNER JOIN `vedomost` ON lessons.subj_id = vedomost.subj_id WHERE teacher_id = %s",
                formToDbStyle(teacher_id));
        return Executor.getInstance().executeSelect(query, extractor);
    }

    @Override
    public List<Subject> getAllSubjects(int kath_id) {
        return Executor.getInstance().executeSelect(String.format("select * from `lessons` where kath_id like %s", formToDbStyle(kath_id)), extractor);
    }

    @Override
    public List<Subject> getAllSubjects(int kath_id, int term) {
        return Executor.getInstance().executeSelect(String.format("select * from `lessons` where kath_id like %s and term like %s", formToDbStyle(kath_id), formToDbStyle(term)), extractor);
    }

    @Override
    public List<Subject> getAllSubjects() {
        return null;
    }

    @Override
    public void createSubject(Subject subject) {
        String query = String.format("insert into `lessons`" + "valuer(%s, %s, %s, %s, %s, %s)",
                                    null,
                                    formToDbStyle(subject.getKath_id()),
                                    formToDbStyle(subject.getName()),
                                    formToDbStyle(subject.getHours()),
                                    formToDbStyle(subject.getExam()),
                                    formToDbStyle(subject.getTerm()));
        Executor.getInstance().execute(query);
    }

    @Override
    public void deleteSubject(Subject subject) {

    }

    @Override
    public Subject getSubject(Integer id) {
        List<Subject> lst = Executor.getInstance().executeSelect(String.format("select * from `lessons` where id like %s", formToDbStyle(id)), extractor);
        return lst.get(0);
    }

    @Override
    public void deleteSubject(Integer id) {

    }

    @Override
    public void changeHours(Subject subject, Integer hours) {

    }

    @Override
    public void changeName(Subject subject, String name) {

    }

    @Override
    public void changeTerm(Subject subject, Integer term) {

    }

    @Override
    public void changeIsExam(Subject subject, Boolean isExam) {

    }

}
