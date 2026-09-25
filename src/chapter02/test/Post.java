package chapter02.test;

public class Post {

    //왜 스태틱이 있지?
    //초기화 되어선 안되기 때문.
    //새로운 객체가 만들어 질 때 마다 0이 되는데,count는 모든 게시글 객체가 단 하나의 카운터를 공유하기 때문에 초기화 되어선 안됨.
    private static int count;
    private final String id;
    private String title;
    private String body;
    private boolean closed;


    //생성자는 반환타입 적지 않음, 반환값 넣을 시 일반 메서드로 착각
    public Post(String title, String body){
        if (title == null || title.isEmpty()){
            //예외처리하는 순간 밖으로 나감. return값 적을 시 오류.
            throw new IllegalArgumentException("title-empty");
        }
        this.count = count + 1;
        this.id = "p" + count;
        this.title = title;
        this.body = body;
        this.closed = false;
    }

    public void changeTitle(String next){
        if (closed == true) {
            System.out.println("reject=clsed");
            return;
        }
        //isEmpty일 필요 없나?
        if (next == null || next.isEmpty()){
            System.out.println("reject=empty-title");
            return;
        }
        title = next;
        System.out.println("revise : " + title);
    }

    public void close(){
        closed = true;
    }

    public void print(){
        System.out.println("title : " + title);
        System.out.println("body : " + body);
    }
}
