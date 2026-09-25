package chapter02.test;

public class AuthorApp {
    public static void main(String[] args) {
        Author writer = new Author("kim");
        //왜 이렇게 나눠두는 거야?
        //Author라는 부품을 잘 독립시켜 두고, post, comment, like 등 나눠서 사용할 수 있기 때문.
        PostWithAuthor post = new PostWithAuthor("자바 복기", writer);

        post.print();

    }
}
