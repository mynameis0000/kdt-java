package grocery;

import java.util.ArrayList;

public class GroceryService {

    //item이 final이니 얘도 final이 되는 건가?
    private final GroceryRepository grocertRepository;
    //이거 안 하니까 main에서 안 돌아감. 왜지?
    public GroceryService(GroceryRepository groceryRepository) {
        this.grocertRepository = groceryRepository;
    }

    GroceryItem register(String name, int quantity){
        if (name == null || name.isEmpty()){
            throw new ArrayIndexOutOfBoundsException("이름이 비어있습니다.");
        }
        if (quantity<1){
            throw new ArrayIndexOutOfBoundsException("수량은 1 이상입니다");
        }

        //컨트롤에선, 저장할 때 여기를 저킬 건데, new해주는 건 register인가, save인가.
        GroceryItem item = new GroceryItem(grocertRepository.nextId(),name, quantity);
        grocertRepository.save(item);
        return item;
    }


    //왜 동일한 과정을 반복하는 거지?
    //저장소에 바로 접근하지 못 하게 하는 건가?
    GroceryItem findById(int id){
        return grocertRepository.findById(id);
    }

    ArrayList<GroceryItem> findAll(){
        return grocertRepository.findByAll();
    }

    GroceryItem changeQuantitiy(int id, int quantitiy){
        if(quantitiy<1){
            throw new ArrayIndexOutOfBoundsException("수량은 1이상입니다.");
        }
        if(findById(id)!=null){
            String name = findById(id).getName();
            GroceryItem itme = new GroceryItem(id, name, quantitiy);
            grocertRepository.replace(itme);
            return itme;
        }
        throw new ArrayIndexOutOfBoundsException("존재하지 않는 id입니다.");
    }

    void delete(int id){
        grocertRepository.delete(id);
    }

}
