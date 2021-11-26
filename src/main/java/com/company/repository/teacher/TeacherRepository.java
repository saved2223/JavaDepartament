package com.company.repository.teacher;


import com.company.Entities.Teacher;

public interface TeacherRepository {

   void createTeacher(Teacher teacher);

   Teacher getTeacher(String login, String password);

   void updatePass(Teacher teacher, String password);

   void updateName(Teacher teacher, String name);

   void updateAdress(Teacher teacher, String adress);

   void updatePosition(Teacher teacher, String position);

   void updateCalary(Teacher teacher, Integer calary);

   void updateKath(Teacher teacher, Integer kathId);

   void updateTitle(Teacher teacher, Integer title);

   void updateWorkingAge(Teacher teacher, Integer workingAge);

   void deleteTeacher(Teacher teacher);
}
