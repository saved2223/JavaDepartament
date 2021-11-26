package com.company.repository.kathedra;

import com.company.Entities.Kathedra;
import com.company.Entities.Subject;
import com.company.repository.StorageUtils.Executor;
import com.company.repository.StorageUtils.Extractor;

import java.util.ArrayList;
import java.util.List;


public class DbKathedraRepository implements KathedraRepository {

    private Extractor<Kathedra> extractor = rs -> {
        List<Kathedra> items = new ArrayList<>();
        while (rs.next()) {
            final Kathedra item = new Kathedra(
                    rs.getInt("fac_id"),
                    rs.getString("kath_name"),
                    rs.getString("zaved_name"),
                    rs.getString("kath_room_number"),
                    rs.getString("kath_phone_number")
            );
            item.setId(rs.getInt("kath_id"));
            items.add(item);
        }
        return items;
    };

    @Override
    public List<Kathedra> getAllKaths() {
        return Executor.getInstance().executeSelect("select * from `kathedra`", extractor);
    }

    @Override
    public void createKathedra(Kathedra kathedra) {

    }

    @Override
    public Kathedra getKathedra(Integer id) {
        return null;
    }

    @Override
    public void changeName(Kathedra kathedra, String name) {

    }

    @Override
    public void changeZaved(Kathedra kathedra, String zavedName) {

    }

    @Override
    public void changeRoom(Kathedra kathedra, String room) {

    }

    @Override
    public void changePhone(Kathedra kathedra, String phone) {

    }
}
