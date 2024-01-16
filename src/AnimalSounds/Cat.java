package AnimalSounds;

public class Cat extends Animal {

    private static String catSound = "Meow";

    @Override
    public void makeSound() {
        System.out.println(catSound);
    }

}
