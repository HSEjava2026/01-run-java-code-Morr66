package ru.hse.lab1;

import ru.hse.lab1.second.Person;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Person person = new Person("Oleg", 18);
        System.out.println(person.name);
        System.out.println(person.age);

    }
}
