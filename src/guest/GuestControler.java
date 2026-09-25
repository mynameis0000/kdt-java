package guest;

import java.util.ArrayList;
import java.util.Scanner;

public class GuestControler {

    public static void main(String[] args) {

        GuestService guestService = new GuestService();
        Scanner sc = new Scanner(System.in);

        while (true) {
        System.out.println("추석 초대");
        System.out.println(
                "1. 이름 올리기, \n" +
                        "2. 명단 보기, \n" +
                        "3. 번호로 찾기, \n" +
                        "0. 종료");

        System.out.println("번호> ");
        String id = sc.nextLine();

        //이름 올리기 - 등록
        //id=="1"은 주소를 비교하기에, 오류 발생.
        if (id.equals("1")) {
            System.out.println("이름> ");
            String name = sc.nextLine();
            //결국 Guest를 호출? 하고 저장하는 구나.
            Guest registered = guestService.register(name);
            System.out.println("명단에 올렸습니다. 번호" + registered.getId() + ", " + registered.getName());
        }
        //명단보기 - 전원 호출
        else if(id.equals("2")) {
            //반복해서 id랑 name를 출력
            //ArrayList<> 뒤 ()필요 없나? 왜지?
            ArrayList<Guest> list = guestService.findAll();
            for (Guest guest : list) {
                //getName()을 어떻게 호출하지?
                System.out.println(guest.getId() + ". " + guest.getName());
            }
        }
            //번호로 찾기 - 1인 찾기
        else if(id.equals("3")) {
            System.out.println("번호> ");
            String guest_id = sc.nextLine();
            int guest_id_int = Integer.parseInt(guest_id);
            Guest guest = guestService.findById(guest_id_int);
            System.out.println(guest_id + ". " + guest.getName());
        }
        else if(id.equals("0")){
            System.out.println("다음에 또 만나요.");
            break;
        }
        }
    }
}
