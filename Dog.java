public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog " + this.getName() + " barks. It is " + this.getAge() + " years old.");
    }
}
