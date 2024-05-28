package CodeSmells_lab_5.LargeClass;

import java.util.ArrayList;
import java.util.List;
public class Enemies {
    private List<String> enemies;

    public Enemies() {
        this.enemies = new ArrayList<>();
    }
    public void addEnemy(String enemy) {
        this.enemies.add(enemy);
    }

    public void removeEnemy(String enemy) {
        this.enemies.remove(enemy);
    }
    public void displayEnemies() {
        System.out.println("Enemies: " + this.enemies);
    }

    public List<String> getEnemies() {
        return enemies;
    }
}
