package grocery;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryController {

    private final GroceryService groceryService;
    private final Scanner sc;
    public GroceryController(GroceryService groceryService, Scanner sc) {
        this.groceryService = groceryService;
        this.sc = sc;
    }

    public static void main(String[] args) {
        //여기서 왜 또 호출함???
        GroceryRepository repository = new GroceryRepository();
        GroceryService groceryService = new GroceryService(repository);

        Scanner sc = new Scanner(System.in);
        boolean is_turn = true;
        while(is_turn){

            System.out.println("추석 장보기");
            System.out.println("1. 장 올리기");
            System.out.println("2. 장 하나 보기");
            System.out.println("3. 장 목록");
            System.out.println("4. 수량 바꾸기");
            System.out.println("5. 장 지우기");
            System.out.println("0. 종료");
            System.out.print("번호 > ");
            int number = Integer.parseInt(sc.nextLine());

            switch (number){

                case 1 -> {
                    System.out.print("이름> ");
                    String name = sc.nextLine();

                    System.out.print("수량> ");
                    int quantity = sc.nextInt();
                    sc.nextLine(); // 엔터 버퍼 비우기
                    try {
                        GroceryItem item = groceryService.register(name, quantity);
                        System.out.println("장을 올렸습니다. 번호 " + item.getId() + ", " + item.getName() + ", " + item.getQuantity() + "개");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 2 -> {
                    System.out.print("번호 >");
                    int id = Integer.parseInt(sc.nextLine());
                    sc.nextLine();
                    try {
                        GroceryItem item = groceryService.findById(id);
                        System.out.println(item.getId() + ". " + item.getName() + " / " + item.getQuantity() + "개");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 3 ->{
                    ArrayList<GroceryItem> items = groceryService.findAll();
                    System.out.print("장 목록");
                    if (items.size() == 0) {
                        System.out.println("아직 올린 장이 없습니다.");
                    } else {
                        for (int i = 0; i < items.size(); i++) {
                            GroceryItem item = items.get(i);
                            System.out.println(item.getId() + ". " + item.getName() + " / " + item.getQuantity() + "개");
                        }
                    }
                }

                case 4 -> {
                    System.out.print("번호 >");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("수량 > ");
                    int quantity = Integer.parseInt(sc.nextLine());
                    sc.nextLine();
                    try {
                        GroceryItem item = groceryService.changeQuantitiy(id, quantity);
                        System.out.println("수량을 바꿨습니다. 번호 " + item.getId() + ", " + item.getName() + ", " + item.getQuantity() + "개");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 5 -> {
                    System.out.print("번호 >");
                    int id = Integer.parseInt(sc.nextLine());
                    sc.nextLine();
                    try {
                        groceryService.delete(id);
                        System.out.println("장을 지웠습니다. 번호 " + id);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 0 -> {
                    System.out.println("다음에 또 장 봐요");
                    is_turn = false;
                }
            }

        }

    }

}
