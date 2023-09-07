import animals.model.Animal;
import animals.enums.AnimalType;
import animals.enums.CommandType;
import helper.InputHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static helper.InputHelper.validateAndCreate;


public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        do {
            System.out.println("Выберите одну из команд: ADD/LIST/EXIT");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            System.out.println("Вы ввели " + command);
            switch (command.trim().toUpperCase()) {
                case (CommandType.ADD) :
                    System.out.println("Какое животное добавить: CAT/DOG/DUCK");
                    scanner = new Scanner(System.in);
                    command = scanner.nextLine();
                    switch (command.trim().toUpperCase()) {
                        case (AnimalType.CAT) :
                            Animal animal = validateAndCreate(AnimalType.CAT, InputHelper.inputAnimalType(System.in));
                            animals.add(animal);
                            break;
                        case (AnimalType.DOG) :
                            Animal dog = validateAndCreate(AnimalType.DOG, InputHelper.inputAnimalType(System.in));
                            animals.add(dog);
                            break;
                        case (AnimalType.DUCK) :
                            Animal duck = validateAndCreate(AnimalType.DUCK, InputHelper.inputAnimalType(System.in));
                            animals.add(duck);
                            break;
                        default:
                            System.out.println("Введенный тип животного не найден [" + command.trim() + "]. Введите повторно");
                            break;
                    }
                    break;
                case (CommandType.LIST) :
                    for(Animal animal : animals) {
                        System.out.println(animal.toString());
                    }
                    break;
                case (CommandType.EXIT) :
                    System.exit(0);
                default:
                    System.out.println("Выбрана некорректная команда. Введите команду повторно.");
            }
        } while (true);

    }
}