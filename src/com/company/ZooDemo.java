package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ZooDemo {

    public static void main(String[] args) {
	// write your code here

//        Your program should include at least (5) classes: Zoo, Pen, Animal, BabyAnimal, and ZooDemo. Done
//
//                A Zoo should have (1) property: a collection of Pens. I think I'm done???
//
//        A Pen should have (2) properties: a collection of Animals and a collection of BabyAnimals. I think I'm done???
//
//                Animal should have at least (3) properties (such as "species", "size", "gender"). Animal should have a
//                parameterized constructor. I think I'm done???
//
//                BabyAnimal should inherit from Animal and should have at least (1) additional instance variable. done
//                BabyAnimal should have a parameterized constructor that calls its superclass to construct part of a
//                BabyAnimal object. done
//
//                Write a program in ZooDemo that allows the zookeeper to:
//        Set up new Pens
//        Remove Pens
//        Add an Animal to a Pen
//        Add a BabyAnimal to a Pen
//        Remove Animals and BabyAnimals from pens
//        Display all the Animals in a Pen
//        Display all the Animals in the Zoo.
//                Bonus
//        Your program should not allow the zookeeper to add more than (4) total Animals or (10) total BabyAnimals to
//        a Pen.
//                Your program should not allow the zookeeper to add a BabyAnimal to a Pen unless you already have a
//                male Animal and a female Animal living in the Pen.
//        Your program should include an additional class, Habitat, which should be a property of Animal & BabyAnimal
//        and should describe what the animal's habitat is like (desert, forest, hot, cold, etc.).
//

        Scanner scan = new Scanner(System.in);
        String zooKeeperInput;
        Zoo zoo = new Zoo();
        Pen pen = new Pen();
        final String setUpPen = "1";
        final String removePen = "2";
        final String addAnimalToPen = "3";
        final String addBabyAnimalToPen = "4";
        final String removeAnimalOrBabyAnimal = "5";
        final String displayPens = "6";
        final String displayZoo = "7";


        do {

            System.out.println("__________Hello Zookeeper__________");
            System.out.println("What would you like to do? Please enter a number to select your option.\n" +
                    "1.Set up a Pen\n" +
                    "2.Remove a Pen\n" +
                    "3.Add a Animal to a Pen\n" +
                    "4.Add a Baby Animal to a Pen\n" +
                    "5.Remove Animal and Baby Animal from Pens\n" +
                    "6.Display all Animals in a Pen\n" +
                    "7.Display all Animals in a Zoo");

            zooKeeperInput = scan.nextLine();

                switch (zooKeeperInput){
                    case setUpPen:


                        break;
                    case removePen:
                        break;
                    case addAnimalToPen:

                        Animal animal = new Animal("","","");

                        System.out.println("What is the species name that you would like to add?");
                        zooKeeperInput = scan.nextLine();
                        animal.setSpecies(zooKeeperInput);

                        System.out.println("What is the size of the animal?");
                        zooKeeperInput = scan.nextLine();
                        animal.setSize(zooKeeperInput);

                        System.out.println("What is the gender of the animal?");
                        zooKeeperInput = scan.nextLine();
                        animal.setGender(zooKeeperInput);

                        pen.addAnimalToPen(animal);


                        break;
                    case addBabyAnimalToPen:
                        BabyAnimal babyAnimal = new BabyAnimal("", "", "", "");

                        System.out.println("What is the species name for the Baby Animal?");
                        zooKeeperInput = scan.nextLine();
                        babyAnimal.setSpecies(zooKeeperInput);

                        System.out.println("what is the size of the Baby Animal");
                        zooKeeperInput = scan.nextLine();
                        babyAnimal.setSize(zooKeeperInput);

                        System.out.println("What is the gender of the Baby Animal?");
                        zooKeeperInput = scan.nextLine();
                        babyAnimal.setGender(zooKeeperInput);

                        System.out.println("What is the age of the Baby Animal?");
                        zooKeeperInput = scan.nextLine();
                        babyAnimal.setAge(zooKeeperInput);

                        pen.addBabyAnimalToPen(babyAnimal);

                        break;
                    case removeAnimalOrBabyAnimal:
                        break;
                    case displayPens:
                        pen.viewAllAnimals();
                        pen.viewAllBabyAnimals();
                        break;
                    case displayZoo:
                        break;



                }






        } while (true);





    }
}
