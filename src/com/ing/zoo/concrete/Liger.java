package com.ing.zoo.concrete;

import com.ing.zoo.animal.Animal;
import com.ing.zoo.animal.Carnivore;
import java.util.Random;

public class Liger extends Animal implements Carnivore {

    public Liger() {
        this.name = "unnamed liger";
        this.helloText = "roar";
        this.eatText = "nomnomnom";
    }

    public Liger(String name) {
        this.name = name;
        this.helloText = "roar, my name is " + name;
        this.eatText = "nomnomnom";
    }

    @Override
    public void sayHello() {
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(3);
        if (rnd == 0) {
            System.out.println("jumps through a hoop of fire");
        } else if (rnd == 1) {
            System.out.println("roars loudly");
        } else {
            System.out.println("balances on a ball");
        }
    }
}
