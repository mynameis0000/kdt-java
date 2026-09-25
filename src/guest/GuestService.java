package guest;

import java.util.ArrayList;

public class GuestService {
    //0. 당장의 명부 받아옴
    GuestRepository guestRepository = new GuestRepository();

    //1. 등록 및 이름 입력 규칙 검사
    Guest register(String name){
        if(name == null|| name.isEmpty()){
            throw new IllegalArgumentException("이름이 비었습니다.");
        }

        //2. 저장소에게 등록 요청
        //guestRepository.nextId()하면, 순서대로 입렫되는 건가?
        Guest guest = new Guest(guestRepository.nextId(), name);
        guestRepository.save(guest);
        return guest;
    }

    //레퍼지토리를 호출해서 하는 이유가 뭐였지?
    //2.1인 조회
    Guest findById(int id){
        return guestRepository.findById(id);
    }

    //3. 전원 조회
    ArrayList<Guest> findAll(){
        return guestRepository.findAll();
    }
}
