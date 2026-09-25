package chapter02.lesson05;

public class PostService {
    //필드 타입을 전략 패턴에선 인터페이스를 넣어줌.
    //new로 postservice를 호출한다고 해도, repository는 바뀌지 않음
    private final PostRepository repository;

    public PostService(PostRepository repository) {
        this.repository = repository;
    }
}
