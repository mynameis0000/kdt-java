package chapter02.test1;

public class KimbapItem extends CafeItem{

    //printWon()은 작성하지 않는 이유. abstract가 없으니?
    @Override
    public int price() {
        return 4500;
    }
}
