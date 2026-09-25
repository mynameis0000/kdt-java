package chapter02.test;

public class PostDomainDemo {

    public static void main(String[] args) {
        Post post1 = new Post("첫 글", "내용입니다");
        //Post post2 = new Post("", "내용입니다"); 예외 처리 확인 : 정상 작동o

        post1.changeTitle("수정된 제목");
        post1.close();
        post1.changeTitle("마감 후 수정된 제목");
        post1.print();
    }

}

