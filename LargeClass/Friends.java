package CodeSmells_lab_5.LargeClass;


import java.util.ArrayList;
import java.util.List;
public class Friends {
    private List<String> friends;

    public Friends() {
        this.friends = new ArrayList<>();
    }
    public void addFriend(String friend) {
        this.friends.add(friend);
    }

    public void removeFriend(String friend) {
        this.friends.remove(friend);
    }
    public void displayFriends() {
        System.out.println("Friends: " + this.friends);
    }

    public List<String> getFriends() {
        return friends;
    }
}
