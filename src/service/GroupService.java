package service;

import model.Group;

import java.util.List;

public interface GroupService {
String addNewGroup(Group group);
String setGroupById(int id);
    List<Group> getAllGroups();
String updateGroupName(int id,String name);
List<Group> filterByYear();
    List<Group>sortGroupByYear();
    void deleteGroupById();
}
