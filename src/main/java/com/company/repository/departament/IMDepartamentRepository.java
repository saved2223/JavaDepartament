package com.company.repository.departament;

import com.company.Entities.Departament;

import java.util.List;


public class IMDepartamentRepository implements DepartamentRepository {

    @Override
    public List<Departament> getAllDeps() {
        return null;
    }

    @Override
    public void createDepartament(Departament departament) {

    }

    @Override
    public Departament getDepartament(Integer id) {
        return null;
    }

    @Override
    public void changeName(Departament departament, String name) {

    }

    @Override
    public void changeHead(Departament departament, String headName) {

    }

    @Override
    public void changeHeadRoom(Departament departament, String room) {

    }

    @Override
    public void changeHeadPhone(Departament departament, String phone) {

    }
}
