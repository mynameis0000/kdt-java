package chapter02.chiken;

public class VipDiscountPolicy implements DiscountPolicy {
    @Override
    public int discount(int price) {
        
        //price*0.9하면 double이 되어버림
        return (int)(price * 0.9);
    }
}