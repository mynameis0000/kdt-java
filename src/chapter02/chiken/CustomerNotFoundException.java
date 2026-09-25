package chapter02.chiken;

public class CustomerNotFoundException extends IllegalArgumentException{
    public CustomerNotFoundException(int id) {
        super("해당 id의 치킨이 없습니다 : " + id);
    }
}
