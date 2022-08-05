package pt.paterns.behavioral.template.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EverydayExampleComparator {

    public static void main(String[] args) {

        Person jane = new Person("Jane", "+351 964 784 521" , 39);
        Person john = new Person("John", "+351 964 784 999", 41);
        Person jack = new Person("Jack", "+351 964 784 666", 38);

        List<Person> people = new ArrayList<>();
        people.add(jane);
        people.add(john);
        people.add(jack);

        System.out.println("Not sorted");
        printContents(people);

        Collections.sort(people);

        System.out.println("\nSorted by age");
        printContents(people);

    }

    private static void printContents(List<Person> people) {
        people.forEach(person -> System.out.println(person.name() + " : " + person.age()));
    }

}
