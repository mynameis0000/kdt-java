package chapter02.test;

public class PinnedDemo{

    public static void main(String[] args){
        PinnedPost pinPost = new PinnedPost("공지사항", "중요 안내");

        pinPost.changeTitle("제목 변경 시도");

        pinPost.unpin();

        pinPost.changeTitle("정상 변경된 공지");
        pinPost.print();
    }
}
