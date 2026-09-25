package chapter02.test1;

public class CafeMenuApp {

    public static void main(String[] args) {
        //꼭 main안에 넣어야 하는 코드인가?
        //Arragement는 없어도 됨? 얘는 리스트랑 무슨 차이였지?
        CafeItem[] item = {new KimbapItem(), new WaterItem()};

        for (CafeItem items : item){
            items.printWon();
        }
    }

}
