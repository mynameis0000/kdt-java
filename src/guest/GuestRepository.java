package guest;

import java.util.ArrayList;

public class GuestRepository {

    //0.객체 생성
    //명단 받아야 하니 리스트먼저 만들어주는 건가?
    ArrayList<Guest> guests = new ArrayList<>();
    private static int nextNumbrt =0;

    //존재 이유가 뭐지
    int nextId(){
        nextNumbrt =  nextNumbrt+1;
        return nextNumbrt;
    }

    //1. 객체 저장
    void save(Guest guest){
        guests.add(guest);
    }

    //2.객체 조회
    Guest findById(int id){
        //guests.id로 찾을 수 없던가? arratlist는 하나씩 조회해야 하던가?

        for(Guest guest : guests){
            if (guest.getId()==id){
                return guest;
            }
        }
        //얘가 있으면 return없어도 바로 종료?
        throw new IllegalArgumentException("명단에 없습니다. 번호 = " + id);
    }

    //3. 객체 전원 조회
    ArrayList<Guest> findAll(){
        //guests 그냥 넘겨주면 안된다고 함. 따로 리스트 만들라는데 어떻게?
        return new ArrayList<>(guests);
    }


}
