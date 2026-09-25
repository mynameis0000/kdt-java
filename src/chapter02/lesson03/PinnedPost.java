package chapter02.lesson03;

// 1. Post를 상속받음
public class PinnedPost extends Post {
    private boolean pinned;

    // 제목과 내용을 받아 생성 (기본값은 고정 상태로 설정)
    public PinnedPost(String title, String body) {
        super(title, body); // 2. 부모 생성자 호출 (반드시 생성자 첫 줄)
        this.pinned = true;  // 핀으로 고정된 게시글로 초기화
    }

    public void pin() {
        this.pinned = true;
    }

    public void unpin() {
        this.pinned = false;
    }

    public boolean isPinned() {
        return this.pinned;
    }

    // 3. 제목 변경 오버라이딩 (고정 글이면 수정 거부, 아니면 부모 기능 실행)
    @Override
    public void changeTitle(String next) {
        if (this.pinned) {
            System.out.println("reject=pinned");
            return;
        }
        super.changeTitle(next); // 부모의 changeTitle 로직 재사용
    }

    // 4. 출력 기능 오버라이딩
    @Override
    public void print() {
        super.print(); // 부모의 title, body 출력 실행
        System.out.println("pinned= " + this.pinned); // 추가로 고정 여부 출력
    }
}