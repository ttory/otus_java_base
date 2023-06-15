/*
 * Copyright 2023.
 * Student's project.
 * Author: Polyanskaya Victory.
 */

package ru.homework.animals;

public class Animal {
    private String name;
    private int age;
    private float weight;
    private String colour;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new RuntimeException("Возраст не может быть меньше 0");
        }
        this.age = age;
    }

    public void setWeight(float weight) {
        if (weight < 0) {
            throw new RuntimeException("Вес не может быть меньше 0");
        }
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void say() {
        System.out.println("Я говорю");
        System.out.println();
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public void eat() {
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        String currAgeType;
        if (age == 1) {
            currAgeType = "год";
        } else if (age < 5) {
            currAgeType = "года";
        } else {
            currAgeType = "лет";
        }
        return "Привет! Меня зовут " + name + ", мне " + age + " " + currAgeType + ", я вешу - " + weight +
                " кг, мой цвет - " + colour + ".";
    }
}
