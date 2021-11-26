package com.company.repository.vedomost;


import com.company.Entities.Vedomost;

public interface VedomostRepository {

   void createVedomost(Vedomost vedomost);

   Vedomost getVedomost(Integer id);

   void delete(Vedomost vedomost);
   void delete(Integer id);




}
