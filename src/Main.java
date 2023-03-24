import model.Group;
import service.impl.GroupImpl;

public class Main {
    public static void main(String[] args) {


        Group group=new Group(1,"Java-9","Jakshuu okushat",2022);
        GroupImpl group1=new GroupImpl();
        System.out.println(group1.addNewGroup(group));
        System.out.println(group1.setGroupById(1));
        System.out.println(group1.getAllGroups());
        System.out.println(group1.updateGroupName(1,"Malik"));

    }
}