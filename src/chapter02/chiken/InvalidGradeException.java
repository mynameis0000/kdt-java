package chapter02.chiken;

public class InvalidGradeException extends IllegalArgumentException{
    public InvalidGradeException(String grade) {
        super("해당 grade는 유효하지 않습니다 : " + grade);
    }
}
