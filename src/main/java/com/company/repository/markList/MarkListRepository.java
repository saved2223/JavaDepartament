package com.company.repository.markList;


import com.company.Entities.MarkList;

public interface MarkListRepository {

   void createMarkList(MarkList markList);

   MarkList getMarkList(Integer id);

   void delete(MarkList markList);
   void delete(Integer id);
   void changeMark(MarkList markList, Integer mark);


}
