/*
 * Copyright 2023.
 * Student's project.
 * Author: Polyanskaya Victory.
 */

package ru.homework.animals;

import ru.homework.actions.Flying;

public class Duck extends Animal implements Flying {
    @Override
    public void say() {
        System.out.println("Кря");
        System.out.println();
    }

    @Override
    public void fly() {
        System.out.println("Я лечу");
    }
}
