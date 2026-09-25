package chapter02.review;


public class Main {
    public static void main(String[] args) {
        AnimalRepository repo = new AnimalRepository();
        SoundPolicy policy  = new DogSoungPolicy();
        AnimalService service = new AnimalService(repo, policy);
        Controller controller = new Controller(service);


        Animal a1 = controller.requestAnimal("바둑이");
        Animal a2 = controller.requestAnimal("");

        System.out.println(a1.getId() + " / " + a1.getName() + " / " + a1.getSound());
        System.out.println(a2.getId() + " / " + a2.getName() + " / " + a2.getSound());
    }


}
