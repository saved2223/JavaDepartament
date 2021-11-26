package com.company.repository.student;
import com.company.Entities.Student;
import java.util.List;

public interface StudentStorage {

   void createStudent(Student student);

   Student getStudent(String login, String password);
   Student getStudent(Integer id);

   void updatePass(Student student, String password);

   void updateName(Student student, String name);

   void updateAdress(Student student, String adress);

   void updateDep(Student student, Integer depId);

   void updateKath(Student student, Integer kathId);

   void updateTerm(Student student, Integer term);

   void updateGroup(Student student, Integer group);
   void removeStudent(Integer id);

   List<Student> getAllStuds();
   List<Student> getAllStuds(Integer kath_id);
}
