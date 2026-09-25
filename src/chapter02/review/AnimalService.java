package chapter02.review;

public class AnimalService{


    //이게 생성자인가? new로 호출해야 하는 줄 알았는데
    private final AnimalRepository animalRepository;
    private final SoundPolicy soundPolicy;

    public AnimalService(AnimalRepository animalRepository, SoundPolicy soundPolicy) {
        this.animalRepository = animalRepository;
        this.soundPolicy = soundPolicy;
    }


    Animal register(String name) {
        String sound = soundPolicy.makeSound(name);
        Animal animal = new Animal(name, sound);
        return animalRepository.save(animal);
    }

    Animal getAnimal(Long id) {
        return animalRepository.findById(id);
    }
}
