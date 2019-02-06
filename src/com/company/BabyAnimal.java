package com.company;

public class BabyAnimal extends Animal{

    private String age;

    public BabyAnimal(String species, String size, String gender, String age) {
        super(species, size, gender);
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
