public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 7);
        Cat cat = new Cat("Tom", 2);
        Animal[] animals = new Animal[2];
        Shelter shelter = new Shelter(animals);

        shelter.addAnimal(dog);
        shelter.addAnimal(cat);
        shelter.makeNoise();
    }
}
