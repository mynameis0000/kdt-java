package chapter02.review;

public class DogSoungPolicy implements SoundPolicy{
    @Override
    public String makeSound(String name) {
        if(name==null || name.isEmpty())
            return "왈왈";
        return "멍멍";
    }
}
