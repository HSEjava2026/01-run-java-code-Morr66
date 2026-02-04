package ru.hse.lab1;
import ru.hse.lab1.second.Person;
/**
 *  @author Букин Ярослав Сергеевич
 * @version 1.0
 * @since 2026
 */

public class Main {
    public static void main(String[] args) {
        
        Person person = new Person("Oleg", 18);
        System.out.println(person.name);
        System.out.println(person.age);
    }
}
