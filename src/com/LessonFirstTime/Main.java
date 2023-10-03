package com.LessonFirstTime;

public class Main {

    public static void printName(IName named) {
        System.out.println(named.getName());
    }

    public static void main(String[] args) {

        Pet pet = new Pet("dog", "Lucie");
        Person person = new Person("Martin", 30);

        printName(pet);
        printName(person);
    }
}