package com.company.repository.kathedra;

import com.company.Entities.Kathedra;

import java.util.List;


public class IMKathedraRepository implements KathedraRepository {

    @Override
    public List<Kathedra> getAllKaths() {
        return null;
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
