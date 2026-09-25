package chapter02.lesson05;

import java.util.ArrayList;


//갈아끼울 수 있따고 함. 왜?
public class MemoryPostRepository implements PostRepository{

    //이게 메모리가 됨.
    private final ArrayList<Post> posts = new ArrayList<>();

    @Override
    public void save(Post post) {
        posts.add(post);
    }

    @Override
    public ArrayList<Post> findAll() {
        return posts;
    }
}
