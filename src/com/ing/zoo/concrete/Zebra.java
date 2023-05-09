package com.ing.zoo.concrete;

import com.ing.zoo.animal.Animal;
import com.ing.zoo.animal.Herbivore;
import java.util.Random;

public class Zebra extends Animal implements Herbivore {

    public Zebra() {
        this.name = "unnamed zebra";
        this.helloText = "Hi, I am a zebra";
        this.eatText = "Yum, this is delicious grass!";
    }

    public Zebra(String name) {
        this.name = name;
        this.helloText = "Hi, I am a zebra and my name is " + name;
        this.eatText = "Yum, this is delicious grass!";
    }

    @Override
    public void sayHello() {
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "Yum, this is delicious grass!";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            System.out.println("I can't do any tricks.");
        } else {
            System.out.println("I am a zebra and I can't do tricks.");
        }
    }
}
