package com.ing.zoo.concrete;

import com.ing.zoo.animal.Animal;
import com.ing.zoo.animal.Carnivore;

import java.util.Random;

public class BeardedDragon extends Animal implements Carnivore {

    public BeardedDragon() {
        this.name = "unnamed bearded dragon";
        this.helloText = "I'm a bearded dragon!";
        this.eatText = "Yum, insects!";
    }

    public BeardedDragon(String name) {
        this.name = name;
        this.helloText = "I'm " + name + ", a bearded dragon!";
        this.eatText = "Yum, insects!";
    }

    @Override
    public void sayHello() {
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "Yum, insects!";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(3);
        if (rnd == 0) {
            System.out.println("I can jump up a tree!");
        } else if (rnd == 1) {
            System.out.println("I can puff up my throat!");
        } else {
            System.out.println("I can climb on walls!");
        }
    }
}
