package service.impl;

import db.DataBase;
import model.Group;
import service.GroupService;

import java.util.List;
import java.util.stream.Stream;

public class GroupImpl implements GroupService {
    DataBase dataBase=new DataBase();
    @Override
    public String addNewGroup(Group groups) {
      dataBase.getGroups().add(groups);
        return null;
    }

    @Override
    public String setGroupById(int id) {
    dataBase.getGroups().stream().filter(x->x.getId()==id).forEach(System.out::println);
    return null;
    }

    @Override
    public List<Group> getAllGroups() {
        dataBase.getGroups().stream().forEach(System.out::println);
        return null;
    }

    @Override
    public String updateGroupName(int id,String name) {
        dataBase.getGroups().stream().filter(x->x.getId()==id).map(x->x.getName()==name).forEach(System.out::println);
        return  null;
    }

    @Override
    public List<Group> filterByYear() {
        return null;
    }

    @Override
    public List<Group> sortGroupByYear() {
        return null;
    }

    @Override
    public void deleteGroupById() {

    }
}
