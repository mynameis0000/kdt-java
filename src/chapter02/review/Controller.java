package chapter02.review;

public class Controller {

    private final AnimalService animalService;

    public Controller(AnimalService animalService) {
        this.animalService = animalService;
    }

    Animal requestAnimal(String name){
        return animalService.register(name);
    }

}
