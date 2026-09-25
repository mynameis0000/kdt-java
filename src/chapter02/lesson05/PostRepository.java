package chapter02.lesson05;

import java.util.ArrayList;

public interface PostRepository {

    //Post를 기반으로 규칙을 작성할거니.
    //둘 다 필수로 호출이 되어야 함
    void save(Post post);
    ArrayList<Post> findAll();


}
