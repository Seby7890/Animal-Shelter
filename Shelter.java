public class Shelter {
    private Animal[] animals;
    private int numberOfAnimals;

    public Shelter(Animal[] animals) {
        this.animals = animals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void makeNoise() {
        for (int i = 0; i < numberOfAnimals; i++) {
            animals[i].makeSound();
        }
    }

    public void addAnimal(Animal animal) {
        boolean add = true;
        if (numberOfAnimals >= animals.length) {
            add = false;
        }
        if (add) {
            animals[numberOfAnimals] = animal;
            numberOfAnimals++;
        }
    }
}