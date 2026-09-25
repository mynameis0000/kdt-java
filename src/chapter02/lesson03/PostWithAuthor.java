package chapter02.lesson03; // 같은 패키지

    public class PostWithAuthor {
        //final은 기본적으로 값을 대입해두어야 함.
        //생성자 넣으면 에러 안 남.
        //생성자넣으면 무조건적으로 값이 대입될 거기 때문.
        //final은 외부에서 값을 변화시키지 못 함. 한 번 만드는 즉시 불변의 상태가 됨.
        private final String title;
        private final Author author; // Author 객체 타입 사용

        public PostWithAuthor(String title, Author author) {
            this.title = title;
            this.author = author;
        }

        public void print() {
            System.out.println("title = " + title);
            System.out.println("author = " + author.getName());
        }
    }