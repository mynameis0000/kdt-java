package chapter02.chiken;

public class ChickenNotFoundException extends IllegalArgumentException {
    public ChickenNotFoundException(int id) {

        //String밖에 못 넣는다고?
        //에러를 상속받았고, 얘는 출력이 메시지형태이니 스트링?
        super("해당 id의 치킨이 없습니다 : " + id);
    }
}