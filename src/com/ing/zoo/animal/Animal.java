package com.ing.zoo.animal;

public abstract class Animal {
    protected String name;
    protected String helloText = "Hello, I am a " + getClass().getSimpleName();
    protected String eatText = "Yum, this is delicious!";
    protected final String trick = "Sorry, I don't know any tricks yet.";

    public Animal() {
        this.name = "unnamed";
    }

    public Animal(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println(helloText);
    }

    public void performTrick() {
        System.out.println(trick);
    }

    public String getName() {
        return name;
    }
}