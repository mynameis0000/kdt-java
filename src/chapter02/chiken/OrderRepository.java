package chapter02.chiken;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepository {
    private final List<Order> orders = new ArrayList<>();

    public void save(Order order){
        orders.add(order);
    }

    //왜 List<>를 넘기면 안되는 거지?
    public List<Order> findAll(){
        return new ArrayList<>(orders);
    }
}
