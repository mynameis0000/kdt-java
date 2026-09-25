package guest;


//private한 순간, 생성자와 get은 세트로 줘야 하는 건가?
public class Guest {
    private final int id;
    private final String name;

    public Guest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
