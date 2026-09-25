package chapter02.lesson03;

public class Human {
    private String name;
    private int age;
    private boolean is_man;

    public Human(String name, int age, boolean is_man) {
        this.name = name;
        this.age = age;
        this.is_man = is_man;
    }

    public int getAge() {
        return age;
    }

    public boolean getGender() {
        return is_man;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.is_man = gender;
    }
}
