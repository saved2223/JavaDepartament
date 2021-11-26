package com.company.repository.factory;

import com.company.repository.departament.DepartamentRepository;
import com.company.repository.departament.IMDepartamentRepository;
import com.company.repository.group.GroupRepository;
import com.company.repository.group.IMGroupRepository;
import com.company.repository.kathedra.IMKathedraRepository;
import com.company.repository.kathedra.KathedraRepository;
import com.company.repository.markList.IMMarkListRepository;
import com.company.repository.markList.MarkListRepository;
import com.company.repository.student.IMStudentStorage;
import com.company.repository.student.StudentStorage;
import com.company.repository.subject.IMSubjectRepository;
import com.company.repository.subject.SubjectRepository;
import com.company.repository.teacher.IMTeacherRepository;
import com.company.repository.teacher.TeacherRepository;
import com.company.repository.vedomost.IMVedomostRepository;
import com.company.repository.vedomost.VedomostRepository;

public class IMStorageFactory implements StorageFactory{

    @Override
    public DepartamentRepository getDepartamentStorage() {
        return new IMDepartamentRepository();
    }

    @Override
    public GroupRepository getGroupStorage() {
        return new IMGroupRepository();
    }

    @Override
    public KathedraRepository getKathedraStorage() {
        return new IMKathedraRepository();
    }

    @Override
    public MarkListRepository getMarkListStorage() {
        return new IMMarkListRepository();
    }

    @Override
    public StudentStorage getStudentStorage() {
        return new IMStudentStorage();
    }

    @Override
    public SubjectRepository getSubjectStorage() {
        return new IMSubjectRepository();
    }

    @Override
    public TeacherRepository getTeacherStorage() {
        return new IMTeacherRepository();
    }

    @Override
    public VedomostRepository getVedomostStorage() {
        return new IMVedomostRepository();
    }
}
