package com.company.service;

import com.company.Entities.Departament;
import com.company.Entities.Group;
import com.company.Entities.Kathedra;
import com.company.Entities.Student;
import com.company.controller.Session;
import com.company.repository.factory.StorageFactory;
import org.apache.taglibs.standard.tag.common.sql.SetDataSourceTagSupport;

import java.util.List;

public class UtilService {
    private StorageFactory sf;

    public UtilService(StorageFactory sf){
        this.sf = sf;
    }

    public boolean arePasswordsSame(String pass1, String pass2){
        if(pass1.equals(pass2)){
            return true;
        }
        else return false;
    }

    public void changePassCurrUser(String pass){
        if(Session.getInstance().getTeacher() != null){
            sf.getTeacherStorage().updatePass(Session.getInstance().getTeacher(), pass);
        }
        else {
            sf.getStudentStorage().updatePass(Session.getInstance().getStudent(), pass);
        }
        Session.getInstance().getCurr().setPassword(pass);
    }

    public List<Kathedra> getAllKaths(){
        return sf.getKathedraStorage().getAllKaths();
    }

    public List<Departament> getAllDeps(){
        return sf.getDepartamentStorage().getAllDeps();
    }

    public List<Group> getAllGroups(){
        return sf.getGroupStorage().getAllGroups();
    }

    public List<Student> getAllStuds(){ return sf.getStudentStorage().getAllStuds();}
}
