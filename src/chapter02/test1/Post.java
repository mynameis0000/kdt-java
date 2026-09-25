package chapter02.test1;

public class Post implements Printable{

    private String title;
    private String body;
    private static int count = 0;

    public Post(String title, String body){

        this.title = title;
        this.body = body;

        //this.count로 안 쓰는 이유는?
        count++;

    }

    String getTitle(){return title;};
    String getBody(){return body;};
    //static을 붙이는 이유는?
    public static int getCount(){return count;};

    @Override
    public void print() {
        System.out.println("title = " + title);
        System.out.println("body = " + body);
    }
}
