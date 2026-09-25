package chapter02.chiken;

public class Chicken {

    //고유값이니까?
    private final int id;
    private String name;
    private int price;


    public int getId() { return id; }
    public String getName() { return name; }
    public int getPrice() { return price; }

    public Chicken(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
