package chapter02.chiken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChickenRepository {

    //db대신 쓰는 저장소
    private final Map<Integer, Chicken> store = new HashMap<>();


    public void save(Chicken chicken){
        //getId말고 그냥 id에 접근하려 했는데, 가능한가? 비효율이긴 하지만.
        store.put(chicken.getId(), chicken);
    }

    public Chicken findById(int id){
        //if (store.get(id)!=id) 바로 접근하려 했는데, 틀렸음.
        Chicken found = store.get(id);
        if (found == null){
            //오류를 class 호출로 해도 돼?
            throw new ChickenNotFoundException(id);
        }
        return found;
    }

    public List<Chicken> findAll(int id){
        //store의 치킨들의 벨류(chiken)만 list화 해서 건네줌.
        return new ArrayList<>(store.values());
    }
}
