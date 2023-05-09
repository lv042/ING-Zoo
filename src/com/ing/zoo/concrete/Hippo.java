    package com.ing.zoo.concrete;

    import com.ing.zoo.animal.Animal;
    import com.ing.zoo.animal.Carnivore;
    import com.ing.zoo.animal.Herbivore;

    import java.util.Random;

    public class Hippo extends Animal implements Herbivore, Carnivore {

        public Hippo() {
            this.name = "unnamed hippo";
            this.helloText = "I'm a hippo!";
            this.eatText = "Munch munch, yummy grass!";
        }

        public Hippo(String name) {
            this.name = name;
            this.helloText = "I'm " + name + ", a hippo!";
            this.eatText = "Munch munch, yummy grass!";
        }

        @Override
        public void sayHello() {
            System.out.println(helloText);
        }

        @Override
        public void eatLeaves() {
            eatText = "Munch munch, yummy grass!";
            System.out.println(eatText);
        }

        @Override
        public void eatMeat() {
            eatText = "Yum, juicy meat!";
            System.out.println(eatText);
        }

        @Override
        public void performTrick() {
            Random random = new Random();
            int rnd = random.nextInt(3);
            if (rnd == 0) {
                System.out.println("I can swim underwater!");
            } else if (rnd == 1) {
                System.out.println("I can open my mouth really wide!");
            } else {
                System.out.println("I can sleep underwater!");
            }
        }
    }
