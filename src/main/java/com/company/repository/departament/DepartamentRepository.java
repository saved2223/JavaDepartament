package com.company.repository.departament;


import com.company.Entities.Departament;

import java.util.List;

public interface DepartamentRepository {

   void createDepartament(Departament departament);

   Departament getDepartament(Integer id);
   List<Departament> getAllDeps();

   void changeName(Departament departament, String name);
   void changeHead(Departament departament, String headName);
   void changeHeadRoom(Departament departament, String room);
   void changeHeadPhone(Departament departament, String phone);



}
