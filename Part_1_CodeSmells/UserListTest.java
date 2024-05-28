package CodeSmells_lab_5.Part_1_CodeSmells;

import java.util.ArrayList;

public class UserListTest {
    public static void main(String[] args) {
        ArrayList<String> usernames = new ArrayList<>();
        usernames.add("admin1");
        usernames.add("user2");

        UserListProcessor processor = new UserListProcessor(usernames);

        User newUser = new User("user3", "user3@example.com", "password", "address");
        processor.addUser(newUser);
        User newAdmin = new User("admin4", "admin4@example.com", "password", "address");
        processor.addUser(newAdmin);
        processor.processUserList();


        AdminCounter counter = processor.countAdminUsers();
        System.out.println("Number of admin users: " + counter.getCount());

        processor.removeUser("user2");
        processor.removeUser("admin1");
        processor.processUserList();
    }
}
