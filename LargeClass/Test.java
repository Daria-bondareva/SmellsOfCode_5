package CodeSmells_lab_5.LargeClass;

public class Test {
    public static void main(String[] args) {
        LargeClass largeClass = new LargeClass("John Doe", 30, "Male");
        largeClass.addFriend("Alice");
        largeClass.addFriend("Bob");
        largeClass.addEnemy("Charlie");
        largeClass.addTask("Task 1");
        largeClass.addTask("Task 2");

        largeClass.displayInfo();

        largeClass.removeFriend("Alice");
        largeClass.removeEnemy("Charlie");
        largeClass.removeTask("Task 1");

        largeClass.displayInfo();
    }
}
