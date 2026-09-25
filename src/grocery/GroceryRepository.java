package grocery;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryRepository {

    HashMap<Integer, GroceryItem> store = new HashMap<>();
    ArrayList<Integer> ids = new ArrayList<>();
    private int nextNumber = 0;

    int nextId(){
        return nextNumber += 1;
    }

    void save(GroceryItem item){
        store.put(item.getId(), item);
        ids.add(item.getId());
    }

    GroceryItem findById(int id){
        //id != ids.get(id-1)가 아니었어. 왜지??
        if(!store.containsKey(id)){
            throw new IllegalArgumentException("장을 찾을 수 없습니다. = " + id);
        }
        return store.get(id);
    }

    ArrayList<GroceryItem> findByAll(){
        ArrayList<GroceryItem> lists = new ArrayList<>();
        for (GroceryItem id : store.values()){
            lists.add(id);
        }
        return lists;
    }

    //Map.get(key) = 벨류값을 줌.
    //Map.values = 벨류값 전체

    void replace(GroceryItem item){
        //findById() 호출이 null이 될 수 있다고 함. 무슨 소리지
        //위에 저거 뭐라고 말하더라. 암튼 item이 곧 GroceryItem이니 해당 class를 끌어올 수 있는 것.
        int id = item.getId();
        if (findById(id)!=null){
            store.put(id, item);
        }
    }

    void delete(int id){
        if (findById(id)!=null){
            store.remove(id);
            //valueOf : id를 integer로 바꿔주는 역할.
            ids.remove(Integer.valueOf(id));
        }
    }
}
