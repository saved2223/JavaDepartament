package com.company.service;

import com.company.repository.factory.DbStorageFactory;

import java.util.HashMap;

public class ServiceFactory {
    private TeacherService teacherService;
    private StudentService studentService;
    private UtilService utilService;

    private  static ServiceFactory instance;
    private DbStorageFactory dbStorageFactory = DbStorageFactory.getInstance();
    private ServiceFactory(){
        this.teacherService = new TeacherService(this.dbStorageFactory);
        this.studentService = new StudentService(this.dbStorageFactory);
        this.utilService = new UtilService(this.dbStorageFactory);
    }

    public ServiceInterface getNeededService(Integer param){
        HashMap<Integer, ServiceInterface> serviceMap = new HashMap<>();
        serviceMap.put(1, teacherService);
        serviceMap.put(2, studentService);
        return serviceMap.get(param);
    }

    public static ServiceFactory getInstance(){
        if (instance == null){
            instance = new ServiceFactory();
        }
        return instance;
    }
    public UtilService getUtilService(){ return this.utilService; };
    public TeacherService getTeacherService(){
        return this.teacherService;
    };
    public StudentService getStudentService(){
        return this.studentService;
    };
}
