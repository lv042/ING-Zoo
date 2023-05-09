package com.ing.zoo.concrete;

import com.ing.zoo.animal.Animal;
import com.ing.zoo.animal.Carnivore;
import com.ing.zoo.animal.Herbivore;

import java.util.Random;

public class Pig extends Animal implements Herbivore, Carnivore {

    public Pig() {
        this.name = "unnamed pig";
        this.helloText = "oink";
        this.eatText = "munch munch oink";
    }

    public Pig(String name) {
        this.name = name;
        this.helloText = "oink, my name is " + name;
        this.eatText = "munch munch oink";
    }

    @Override
    public void sayHello() {
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch oink, delicious leaves!";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            System.out.println("rolls in the mud");
        } else {
            System.out.println("runs in circles");
        }
    }
}
