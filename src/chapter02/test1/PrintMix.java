package chapter02.test1;

import java.util.ArrayList;

public class PrintMix {
    public static void main(String[] args) {
        ArrayList<Printable> lines = new ArrayList<>();

        //밑에 애들은 Printable을 인터페이스로 갖고 있기에 추가 가능
        lines.add(new Post("closed", "no class"));
        lines.add(new LunchSlip());
        //OCP(개방-폐쇄 원칙)
        lines.add(new CheckSlip());

        for (Printable line :  lines){
            System.out.println("-------");
            line.print();
        }
    }
}
