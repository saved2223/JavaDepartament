package com.company.repository.subject;


import com.company.Entities.Subject;

import java.util.List;

public interface SubjectRepository {

   void createSubject(Subject subject);

   Subject getSubject(Integer id);

   void deleteSubject(Subject subject);
   void deleteSubject(Integer id);

   void changeHours(Subject subject, Integer hours);

   void changeName(Subject subject, String name);

   void changeTerm(Subject subject, Integer term);

   void changeIsExam(Subject subject, Boolean isExam);

   List<Subject> getAllSubjects(int kath_id);

   List<Subject> getAllSubjects(int kath_id, int term);
   List<Subject> getAllSubjectsForTeacher(int teacher_id);

   List<Subject> getAllSubjects();

}
