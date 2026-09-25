package chapter02.lesson03;

import java.util.Objects;

public class Post {

    //count는 동일한 객체에서 공유됨. 그러니 static로 지정한다.
    private static int count = 0;
    // 유동적으로 변하지 않음.
    private String title;
    private String body;
    private final String id;
    private boolean closed;

    public void print() {
        System.out.println("title= " + title);
        System.out.println("body= " + body);
    }

    //get 매서드로 값 가져오기
    //set 매서드로 값 수정하기

    //값 수정은 main이 아닌 해당 클래스에 넣어두어야 한다.
    //main은 단순히 '~해라' 정도.

    public String getId() {
        return this.id;
    }

    public void changeTitle(String next) {
        if (this.closed) {
            System.out.println("reject=closed");
            return;
        }
        if (next == null || next.isEmpty()) {
            System.out.println("reject=empty-title");
            return;
        }
        this.title = title;
    }

    public void close() {
        this.closed = true;
    }

    public boolean isClosed() {
        return closed;
    }

    public Post(String title, String body) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("empty-title");
        }
        count = count + 1;
        this.id = "p" + count;
        this.title = title;
        this.body = body;
        this.closed = false;
    }

    public Post(String id, String title, String body) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("empty-title");
        }
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("empty-id");
        }
        this.id = id;
        this.title = title;
        this.body = body;
        this.closed = false;
        count = count + 1;
    }

    public static int getCount() {
        return count;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Post)) {
            return false;
        }
        Post that = (Post) o;
        return id.equals(that.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}