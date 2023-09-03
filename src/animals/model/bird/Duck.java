package animals.model.bird;

import animals.model.Animal;

public class Duck extends Animal {
    public Duck(String name, int age,double weight, String color) {
        super(name, age, weight, color);
    }
    @Override
    public void say() {
        System.out.println("Кря");
    }
}

