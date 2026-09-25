package chapter02.test1;

public class LinePrinter {

    //상속이랑 필드에 정의하는 거랑 차이가 뭐야?
    private final Printable target;
    public LinePrinter(Printable target) {
        this.target = target;
    }

    public void run(){
        target.print();
    }

}
