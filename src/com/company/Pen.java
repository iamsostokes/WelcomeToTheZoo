package com.company;

import java.util.ArrayList;

public class Pen {

    ArrayList<Animal> animals = new ArrayList<>();



    ArrayList<BabyAnimal> babyAnimals = new ArrayList<>();

    public void addAnimalToPen(Animal animal) {
        animals.add(animal);
    }

    public void addBabyAnimalToPen(BabyAnimal babyAnimal) {
        animals.add(babyAnimal);
    }
}
