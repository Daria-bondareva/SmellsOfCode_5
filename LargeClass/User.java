package CodeSmells_lab_5.LargeClass;

public class User {
    private String name;
    private int age;
    private String gender;

    public User(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void displayInfo(){
        System.out.println("Name:" + this.name + "\n" + "Age: " + this.age + "\n" + "Gender: " + this.gender);
    }
}
