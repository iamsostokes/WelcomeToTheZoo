package com.company;

import java.util.ArrayList;

public class Pen {

    ArrayList<Animal> animals = new ArrayList<>();


    ArrayList<BabyAnimal> babyAnimals = new ArrayList<>();

    public void addAnimalToPen(Animal animal) {
        animals.add(animal);
    }

    public void addBabyAnimalToPen(BabyAnimal babyAnimal) {
        babyAnimals.add(babyAnimal);
    }


    public void viewAllAnimals() {
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).printAnimalDetails();
        }

    }

    public void viewAllBabyAnimals() {
        for (int i = 0; i < babyAnimals.size(); i++) {
            babyAnimals.get(i).printBabyAnimalDetails();
        }

    }

}
