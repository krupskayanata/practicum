package animals.model.pet;

import animals.model.Animal;

public class Dog extends Animal {
    public Dog(String name, int age,double weight, String color) {
        super(name, age, weight, color);
    }
    @Override
    public void say() {
        System.out.println("Гав");
    }
}
