package chapter02.lesson03;

public class PinnedDEmo {

    public static void main(String[] args) {
        PinnedPost pin = new PinnedPost("exam", "id");

        pin.changeTitle("quiz");
        pin.pin();
        pin.changeTitle("closed");
        pin.print();
    }

}
