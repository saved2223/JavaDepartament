package com.company.repository.factory;

import com.company.repository.departament.DepartamentRepository;
import com.company.repository.group.GroupRepository;
import com.company.repository.kathedra.KathedraRepository;
import com.company.repository.markList.MarkListRepository;
import com.company.repository.student.StudentStorage;
import com.company.repository.subject.SubjectRepository;
import com.company.repository.teacher.TeacherRepository;
import com.company.repository.vedomost.VedomostRepository;

public interface StorageFactory {

    public GroupRepository getGroupStorage();
    public KathedraRepository getKathedraStorage();
    public MarkListRepository getMarkListStorage();
    public StudentStorage getStudentStorage();
    public SubjectRepository getSubjectStorage();
    public TeacherRepository getTeacherStorage();
    public VedomostRepository getVedomostStorage();
    public DepartamentRepository getDepartamentStorage();
}
