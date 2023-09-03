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
        boolean interrupt = false;
        do {
            System.out.println("Выберите одну из команд: add/list/exit");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            System.out.println("Вы ввели " + command);
            if (CommandType.ADD.name().equalsIgnoreCase(command.trim())) {
                System.out.println("Какое животное добавить: cat/dog/duck");
                scanner = new Scanner(System.in);
                command = scanner.nextLine();
                if (AnimalType.CAT.name().equalsIgnoreCase(command.trim())) {
                    Animal animal = validateAndCreate(AnimalType.CAT, InputHelper.inputAnimalType(System.in));
                    animals.add(animal);
                } else if (AnimalType.DOG.name().equalsIgnoreCase(command.trim())) {
                    Animal animal = validateAndCreate(AnimalType.DOG, InputHelper.inputAnimalType(System.in));
                    animals.add(animal);
                } else if (AnimalType.DUCK.name().equalsIgnoreCase(command.trim())) {
                    Animal animal = validateAndCreate(AnimalType.DUCK, InputHelper.inputAnimalType(System.in));
                    animals.add(animal);
                } else {
                    System.out.println("Животного не найдено " + command.trim());
                }
            } else if (CommandType.LIST.name().equalsIgnoreCase(command.trim())) {
                for(Animal animal : animals) {
                    System.out.println(animal.toString());
                }
            } else if (CommandType.EXIT.name().equalsIgnoreCase(command.trim())) {
                return;
            }
        } while (!interrupt);

    }
}