package chapter02.test;

public class PostWithAuthor {

    private final String title;

    //Author의 뭘 가져오는 거지?
    //글이 작성자를 포함(Has-a)한다" = 컴포지션(조합)
    private final Author author;

    public PostWithAuthor(String title, Author author){
        this.title = title;
        this.author = author;
    }

    public void print(){
        System.out.println("title : " + title);
        System.out.println("author : " + author.getName());
    }

}
