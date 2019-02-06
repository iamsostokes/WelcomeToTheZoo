package com.company;

public class BabyAnimal extends Animal{

    private String age;

    public BabyAnimal(String species, String size, String gender, String age) {
        super(species, size, gender);
        this.age = age;
    }

    public void printBabyAnimalDetails() {
        System.out.println(getSpecies() + " " + getSize() + " " + getGender() + "" + age);
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }



}
