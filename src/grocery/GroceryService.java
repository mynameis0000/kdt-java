package grocery;

import java.util.ArrayList;

public class GroceryService {

    // 선언할 때 값을 안 넣었으므로, 반드시 생성자에서 채워줘야 컴파일 에러가 안 남
    private final GroceryRepository grocertRepository;
    public GroceryService(GroceryRepository groceryRepository) {
        this.grocertRepository = groceryRepository;
    }

    GroceryItem register(String name, int quantity){
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("이름이 비어 있습니다.");
        }
        if (quantity<1){
            throw new ArrayIndexOutOfBoundsException("수량은 1 이상입니다");
        }

        GroceryItem item = new GroceryItem(grocertRepository.nextId(),name, quantity);
        grocertRepository.save(item);
        return item;
    }


    //계층분리, 캠슐화
    GroceryItem findById(int id){
        return grocertRepository.findById(id);
    }

    ArrayList<GroceryItem> findAll(){
        return grocertRepository.findByAll();
    }

    GroceryItem changeQuantitiy(int id, int quantity){
        if(quantity<1){
            throw new ArrayIndexOutOfBoundsException("수량은 1이상입니다.");
        }

        if(findById(id)!=null){
            GroceryItem found = grocertRepository.findById(id);
            GroceryItem updated = new GroceryItem(found.getId(), found.getName(), quantity);
            grocertRepository.replace(updated);
            return updated;
        }
        throw new ArrayIndexOutOfBoundsException("존재하지 않는 id입니다.");
    }

    void delete(int id){
        grocertRepository.delete(id);
    }

}
