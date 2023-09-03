package helper;

import animals.model.Animal;
import animals.model.bird.Duck;
import animals.enums.AnimalType;
import animals.exeptions.AnimalValidationParameterException;
import animals.model.pet.Cat;
import animals.model.pet.Dog;

import java.io.InputStream;
import java.util.Scanner;

public class InputHelper {

    private InputHelper() {

    }

    public static String[] inputAnimalType(InputStream inputText) {
        System.out.println("Выбранное животное cat");
        System.out.println("Введите параметры животного: имя, возраст, вес, цвет, например: Бобик, 35, 57, красный");
        Scanner scanner = new Scanner(inputText);
        String command = scanner.nextLine();
        return command.split("\\s+");
    }

    public static Animal validateAndCreate(AnimalType animalType, String[] inputText) {
        if (inputText == null || inputText.length != 4) {
            throw new AnimalValidationParameterException("Введено некорректное количество параметров. Должно быть 4.");
        }
        int age = 0;

        try {
            age = Integer.parseInt(inputText[1].trim());
        } catch (Exception e) {
            throw new AnimalValidationParameterException("Введен некорректный возраст.");
        }

        int weight = 0;
        try {
            weight = Integer.parseInt(inputText[2].trim());
        } catch (Exception e) {
            throw new AnimalValidationParameterException("Введен некорректный возраст.");
        }
        if (animalType.equals(AnimalType.CAT)) {
            return new Cat(inputText[0], age, weight, inputText[3]);
        } else if (animalType.equals(AnimalType.DOG)) {
            return new Dog(inputText[0], age, weight, inputText[3]);
        } else if (animalType.equals(AnimalType.DUCK)) {
            return new Duck(inputText[0], age, weight, inputText[3]);
        }

        return null;


    }


}
