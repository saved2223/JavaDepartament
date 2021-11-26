package com.company.repository.departament;

import com.company.Entities.Departament;
import com.company.Entities.Kathedra;
import com.company.repository.StorageUtils.Executor;
import com.company.repository.StorageUtils.Extractor;

import java.util.ArrayList;
import java.util.List;


public class DbDepartamentRepository implements DepartamentRepository {

    private Extractor<Departament> extractor = rs -> {
        List<Departament> items = new ArrayList<>();
        while (rs.next()) {
            final Departament item = new Departament(
                    rs.getString("fac_name"),
                    rs.getString("head_name"),
                    rs.getString("head_room_number"),
                    rs.getString("head_phone")
            );
            item.setId(rs.getInt("fac_id"));
            items.add(item);
        }
        return items;
    };



    @Override
    public List<Departament> getAllDeps() {
        return Executor.getInstance().executeSelect("select * from `faculty`", extractor);
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
