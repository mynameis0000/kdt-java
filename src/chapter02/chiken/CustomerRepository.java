package chapter02.chiken;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepository {
    private final Map<Integer, Customer> store = new HashMap<>();

    public void save(Customer customer){
        store.put(customer.getId(), customer);
    }

    public Customer findById(int id){
        Customer found = store.get(id);
        if (found == null){
            //오류를 class 호출로 해도 돼?
            throw new CustomerNotFoundException(id);
        }
        return found;
    }

    public List<Customer> findAll(int id){
        //store의 치킨들의 벨류(chiken)만 list화 해서 건네줌.
        return new ArrayList<>(store.values());
    }
}
