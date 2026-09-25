package chapter02.test1;

public class LinePrinterApp {

    public static void main(String[] args){
        LinePrinter postPrinter = new LinePrinter(new Post("exam", "bring id"));
        LinePrinter slipPrinter = new LinePrinter(new LunchSlip());
        postPrinter.run();
        slipPrinter.run();
    }

}
