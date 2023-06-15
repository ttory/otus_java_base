/*
 * Copyright 2023.
 * Student's project.
 * Author: Polyanskaya Victory.
 */

package ru.homework;

import ru.homework.animals.Animal;
import ru.homework.animals.Cat;
import ru.homework.animals.Dog;
import ru.homework.animals.Duck;
import ru.homework.menu.Commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        List<Animal> animals = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите одну из команд: add/list/exit:");
            String command = scanner.next().trim().toUpperCase();

            for (Commands commands : Commands.values()) {
                if (commands.name().equals(command)) {
                    switch (commands) {
                        case ADD:
                            Animal newAnimal;
                            boolean result = true;
                            System.out.println("Введите тип животного: cat/dog/duck:");
                            String type = scanner.next().trim().toLowerCase();
                            if (type.equals("cat")) {
                                newAnimal = new Cat();
                            } else if (type.equals("dog")) {
                                newAnimal = new Dog();
                            } else if (type.equals("duck")) {
                                newAnimal = new Duck();
                            } else {
                                System.out.println("Выбран несуществующий тип животного");
                                break;
                            }

                            System.out.println("Введите имя животного:");
                            newAnimal.setName(scanner.next().trim());

                            do {
                                System.out.println("Введите возраст животного:");
                                try {
                                    String age = scanner.next().trim();
                                    newAnimal.setAge(Integer.parseInt(age));
                                    result = false;
                                } catch (Exception e) {
                                    System.out.println("Возраст животного должен быть целым числом");
                                }
                            } while (result);

                            result = true;
                            do {
                                System.out.println("Введите вес животного(например 1.4):");
                                try {
                                    String weight = scanner.next().trim();
                                    newAnimal.setWeight(Float.parseFloat(weight));
                                    result = false;
                                } catch (Exception e) {
                                    System.out.println("Вес должен быть числом");
                                }
                            } while (result);

                            System.out.println("Введите цвет животного:");
                            newAnimal.setColour(scanner.next().trim().toLowerCase());
                            animals.add(newAnimal);
                            System.out.println("Животное говорит:");
                            newAnimal.say();
                            break;
                        case LIST:
                            System.out.println("Список всех животных:");
                            for (Animal everyAnimal : animals) {
                                System.out.println(everyAnimal);
                            }
                            break;
                        case EXIT:
                            return;
                    }
                    break;
                }

            }
        }
    }
}
