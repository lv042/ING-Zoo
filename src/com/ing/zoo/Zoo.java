package com.ing.zoo;

import com.ing.zoo.animal.Animal;
import com.ing.zoo.animal.Carnivore;
import com.ing.zoo.animal.Herbivore;
import com.ing.zoo.concrete.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = {"hello", "give leaves", "give meat", "perform trick"};

        List<Animal> animals = new ArrayList<>();
        animals.add(new Pig("Luuk"));
        animals.add(new Lion("Alex"));
        animals.add(new Hippo("Moto Moto"));
        animals.add(new BeardedDragon("Rick"));
        animals.add(new Zebra("Marty"));
        animals.add(new Tiger("Shere Khan"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter command: ");
        String input = scanner.nextLine();

        if (input.startsWith("hello")) {
            String name = input.substring("hello".length()).trim();
            if (name.isEmpty()) {
                for (Animal animal : animals) {
                    System.out.print(animal.getName() + ": ");
                    animal.sayHello();
                }
            } else {
                boolean found = false;
                for (Animal animal : animals) {
                    if (animal.getName().equalsIgnoreCase(name)) {
                        System.out.print(animal.getName() + ": ");
                        animal.sayHello();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Unknown animal: " + name);
                }
            }
        } else {
            switch (input) {
                case "give leaves":
                    for (Animal animal : animals) {
                        if (animal instanceof Herbivore) {
                            System.out.print(animal.getName() + ": ");
                            ((Herbivore) animal).eatLeaves();
                        }
                    }
                    break;
                case "give meat":
                    for (Animal animal : animals) {
                        if (animal instanceof Carnivore) {
                            System.out.print(animal.getName() + ": ");
                            ((Carnivore) animal).eatMeat();
                        }
                    }
                    break;
                case "perform trick":
                    for (Animal animal : animals) {
                        System.out.print(animal.getName() + ": ");
                        animal.performTrick();
                    }
                    break;
                default:
                    System.out.println("Unknown command: " + input);
                    break;
            }
        }
    }
}
