package com.company.repository.factory;

import com.company.repository.departament.DbDepartamentRepository;
import com.company.repository.departament.DepartamentRepository;
import com.company.repository.group.DbGroupRepository;
import com.company.repository.group.GroupRepository;
import com.company.repository.kathedra.DbKathedraRepository;
import com.company.repository.kathedra.KathedraRepository;
import com.company.repository.markList.DbMarkListRepository;
import com.company.repository.markList.MarkListRepository;
import com.company.repository.student.DbStudentStorage;
import com.company.repository.student.StudentStorage;
import com.company.repository.subject.DbSubjectRepository;
import com.company.repository.subject.SubjectRepository;
import com.company.repository.teacher.DbTeacherRepository;
import com.company.repository.teacher.TeacherRepository;
import com.company.repository.vedomost.DbVedomostRepository;
import com.company.repository.vedomost.VedomostRepository;

public class DbStorageFactory implements StorageFactory {

    private static DbStorageFactory instance;
    private DbDepartamentRepository dbDepartamentStorage;
    private DbGroupRepository dbGroupStorage;
    private DbKathedraRepository dbKathedraStorage;
    private DbMarkListRepository dbMarkListStorage;
    private DbStudentStorage dbStudentStorage;
    private DbTeacherRepository dbTeacherStorage;
    private DbSubjectRepository dbSubjectStorage;
    private DbVedomostRepository dbVedomostStorage;


    private DbStorageFactory(){
        this.dbDepartamentStorage = new DbDepartamentRepository();
        this.dbGroupStorage = new DbGroupRepository();
        this.dbKathedraStorage = new DbKathedraRepository();
        this.dbMarkListStorage = new DbMarkListRepository();
        this.dbStudentStorage = new DbStudentStorage();
        this.dbTeacherStorage = new DbTeacherRepository();
        this.dbSubjectStorage = new DbSubjectRepository();
        this.dbVedomostStorage = new DbVedomostRepository();
    }

    public static DbStorageFactory getInstance(){
        if(instance == null){
            instance = new DbStorageFactory();
        }
        return instance;
    }

    @Override
    public DepartamentRepository getDepartamentStorage() {
        return this.dbDepartamentStorage;
    }

    @Override
    public GroupRepository getGroupStorage() {
      return this.dbGroupStorage;
    }

    @Override
    public KathedraRepository getKathedraStorage()
    {
        return this.dbKathedraStorage;
    }

    @Override
    public MarkListRepository getMarkListStorage() {

        return this.dbMarkListStorage;
    }

    @Override
    public StudentStorage getStudentStorage() {

        return this.dbStudentStorage;
    }

    @Override
    public SubjectRepository getSubjectStorage() {

        return this.dbSubjectStorage;
    }

    @Override
    public TeacherRepository getTeacherStorage() {

        return this.dbTeacherStorage;
    }

    @Override
    public VedomostRepository getVedomostStorage() {

        return this.dbVedomostStorage;
    }
}
