package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.giveVoice();

        Duck duck = new Duck();
        duck.giveVoice();

        Animal dogA = new Dog();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dogA);
    }
}
