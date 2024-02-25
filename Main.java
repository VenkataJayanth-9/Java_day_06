public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("Tiger", "Huge", "400kgs");
        doAnimalStuff(animal, "Fast");
        Dog dog = new Dog();
        System.out.println(dog);
    }


    public static void doAnimalStuff(Animal animal, String speed)
    {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("________");
    }
}
