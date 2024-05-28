package CodeSmells_lab_5.LargeClass;
import java.util.ArrayList;
import java.util.List;

public class LargeClass {
    private User user;
    private Friends friend;
    private Enemies enemy;
    private Tasks task;

    public LargeClass(String name, int age, String gender) {
        this.user = new User(name, age, gender);
        this.friend = new Friends();
        this.enemy = new Enemies();
        this.task = new Tasks();
    }

    public void addFriend(String mate) {
        friend.addFriend(mate);
    }
    public void removeFriend(String mate) {
        friend.removeFriend(mate);
    }
    public void addEnemy(String foe) {
        enemy.addEnemy(foe);
    }
    public void removeEnemy(String foe) {
        enemy.removeEnemy(foe);
    }
    public void addTask(String objective) {
        task.addTask(objective);
    }
    public void removeTask(String objective) {
        task.removeTask(objective);
    }
    public void displayInfo() {
        user.displayInfo();
        friend.displayFriends();
        enemy.displayEnemies();
        task.displayTasks();
    }
}
