package chapter02.test1;

public class WaterItem extends CafeItem{

    //printWon()은 작성하지 않는 이유. abstract가 없으니?
    @Override
    public int price() {
        return 1000;
    }
}
