package chapter02.test;

public class PinnedPost extends Post{

    private boolean pinned;

    //상속받을 시, 생성자에는 무조건 super가 포함되어야 하나?
    //자식 클래스 안에 부모 클래스(매게변수 요구 시)를 담을 공간이 먼저 필요함.
    //부모 클래스가 매게변수 요구 안 하면, 없어도 됨.
    public PinnedPost(String title, String body) {
        //Post 생성자를 키러가는 건가?
        super(title, body);
        this.pinned = true;
    }

    public void pin(){
        pinned  = true;
    }

    public void unpin(){
        pinned = false;
    }

    public boolean isPinned(){
        return pinned;
    }

    //ctrl + o 하면 오버라이딩 자동 완성됨.
    @Override
    public void changeTitle(String next) {
        if (this.pinned == true) {
            System.out.println("reject=pinned");
            return;
        }
        super.changeTitle(next);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("pinned : " + this.pinned);
    }
}
