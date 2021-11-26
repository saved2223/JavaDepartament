package com.company.repository.group;


import com.company.Entities.Group;

import java.util.List;

public interface GroupRepository {

   List<Group> getAllGroups();

   void createGroup(Group group);

   Group getGroup(Integer id);

   void changeNumber(Group group, String headName);


}
