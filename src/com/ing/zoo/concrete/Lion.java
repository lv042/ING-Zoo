package com.ing.zoo.concrete;

import com.ing.zoo.animal.Animal;
import com.ing.zoo.animal.Carnivore;
import java.util.Random;

public class Lion extends Animal implements Carnivore {
    public Lion() {
        this.name = "unnamed lion";
        this.helloText = "roar";
        this.eatText = "chomp chomp roar";
    }

    public Lion(String name) {
        this.name = name;
        this.helloText = "roar, my name is " + name;
        this.eatText = "chomp chomp roar";
    }

    @Override
    public void sayHello() {
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "chomp chomp roar, delicious meat!";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            System.out.println("jumps through a ring of fire");
        } else {
            System.out.println("balances on a ball");
        }
    }
}
