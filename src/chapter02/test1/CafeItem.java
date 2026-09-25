package chapter02.test1;

//추상화?
public abstract class CafeItem {

    //price라는 매서드를 만드는 거?
    //안에 아무것도 없어도 괜찮?
    public  abstract int price();

    //printWon()을 호출하면 알아서 price가 호출되는 건가.
    //왜 굳이 이 과정을 2개로 나눈거지?
    public void printWon(){
        System.out.println("won = " + price());
    }

}
