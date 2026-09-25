package chapter02.test1;


//인터페이스에는 print()만 있음.
public class LunchSlip implements Printable{

    //코드의 목적이 뭐지. 이 class의 존재 이유
    @Override
    public void print() {
        System.out.println("pork=6000");
        System.out.println("rice=1000");
    }
}
