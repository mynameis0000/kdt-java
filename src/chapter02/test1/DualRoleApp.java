package chapter02.test1;

public class DualRoleApp {

    public static void main(String[] args) {
        StampSlip slip = new StampSlip();

        //new할 필요가 없나? 뭐가 만들어 진거지?
        Printable printable = slip;
        Dated dated = slip;

        printable.print();
        System.out.println("day= " + dated.dayLabel());

    }

}
