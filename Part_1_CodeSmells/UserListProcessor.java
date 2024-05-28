package CodeSmells_lab_5.Part_1_CodeSmells;

import java.util.ArrayList;
public class UserListProcessor {
    private ArrayList<String> usernames;
    public UserListProcessor(ArrayList<String> usernames) {
        this.usernames = usernames;
    }
    public void checkForAdmin(String username){
        if(username.contains("admin")){
            System.out.println("Admin user detected!");
        }
    }
    public void processUserList() {

        for (int i = 0; i < usernames.size(); i++) {
            String username = usernames.get(i);
            System.out.println("Processing user: " + username);
        }
    }

    public AdminCounter countAdminUsers() {
        AdminCounter counter = new AdminCounter();
        for (String username : usernames) {
            if (username.contains("admin")) {
                counter.amount();
            }
        }
        return counter;
    }
    public void addUser(User user) {
        usernames.add(user.getUsername());
    }
    // Data clumps
    public void sendEmailToUser(User user) {
        // Sending email...
        System.out.println("Email sending to user...");
    }
    public boolean removeUser(String username){
        return usernames.remove(username);
    }
}