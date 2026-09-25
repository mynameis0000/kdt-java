package chapter02.chiken;

public interface DiscountPolicy {
    int discount(int price);

    public static void main(String[] args) {
        DiscountPolicy policy = new VipDiscountPolicy();
        System.out.println(policy.discount(20000)); // 18000
    }
}