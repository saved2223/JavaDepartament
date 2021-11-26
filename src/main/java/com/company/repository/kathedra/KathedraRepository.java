package com.company.repository.kathedra;


import com.company.Entities.Kathedra;

import java.util.List;

public interface KathedraRepository {

   void createKathedra(Kathedra kathedra);

   Kathedra getKathedra(Integer id);
   List<Kathedra> getAllKaths();

   void changeName(Kathedra kathedra, String name);
   void changeZaved(Kathedra kathedra, String zavedName);
   void changeRoom(Kathedra kathedra, String room);
   void changePhone(Kathedra kathedra, String phone);



}
