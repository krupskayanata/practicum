import animals.Animal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Animal animal=new Animal();
        animal.setName("Dima");
        animal.setAge(10);
        System.out.println(animal.toString());
        return;
    }
}