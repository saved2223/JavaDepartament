package com.company.repository.group;

import com.company.Entities.Departament;
import com.company.Entities.Group;
import com.company.repository.StorageUtils.Executor;
import com.company.repository.StorageUtils.Extractor;

import java.util.ArrayList;
import java.util.List;


public class DbGroupRepository implements GroupRepository {

    private Extractor<Group> extractor = rs -> {
        List<Group> items = new ArrayList<>();
        while (rs.next()) {
            final Group item = new Group(
                    rs.getInt("group_number"),
                    rs.getInt("enter_year")
            );
            item.setId(rs.getInt("group_id"));
            items.add(item);
        }
        return items;
    };

    @Override
    public List<Group> getAllGroups() {
        return Executor.getInstance().executeSelect("select * from `group_number`",extractor);
    }

    @Override
    public void createGroup(Group group) {

    }

    @Override
    public Group getGroup(Integer id) {
        return null;
    }

    @Override
    public void changeNumber(Group group, String headName) {

    }
}
