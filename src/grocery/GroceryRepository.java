package grocery;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryRepository {

    //선언 및 초기화 동시에 함.
    private final HashMap<Integer, GroceryItem> store = new HashMap<>();
    private final ArrayList<Integer> ids = new ArrayList<>();
    private int nextNumber = 1;

    public int nextId() {
        int id = nextNumber;
        nextNumber = nextNumber + 1;
        return id;
    }

    void save(GroceryItem item){
        store.put(item.getId(), item);
        ids.add(item.getId());
    }

    //예외를 던지는 메서드는 다른 메서드의 '사전 검증기'로 가볍게 호출해서 재사용
    GroceryItem findById(int id){
        GroceryItem found = store.get(id);
        if (found == null) {
            throw new IllegalArgumentException("장을 찾을 수 없습니다. 번호=" + id);
        }
        return found;
    }

    ArrayList<GroceryItem> findByAll(){
        ArrayList<GroceryItem> lists = new ArrayList<>();

        //for문 : HashMap은 데이터 순서 보장하지 않음. Arraylist를 활용.
        for (int i = 0; i < ids.size(); i++) {
            lists.add(store.get(ids.get(i)));
        }
        return lists;
    }

    void replace(GroceryItem item){
        //findById()에서 검증을 받을 수 있음
        findById(item.getId());
        store.put(item.getId(), item);
    }

    void delete(int id){
        if (findById(id)!=null){
            store.remove(id);
            //valueOf : id를 integer로 바꿔주는 역할.
            ids.remove(Integer.valueOf(id));
        }
    }
}
