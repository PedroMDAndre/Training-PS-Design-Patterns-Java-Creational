package pt.patterns_with_lambdas.chaining;

import pt.patterns_with_lambdas.chaining.function.Function;
import pt.patterns_with_lambdas.chaining.model.Person;
import pt.patterns_with_lambdas.chaining.util.Comparator;

public class PlayWithComparator {

    public static void main(String[] args) {

        Person mary = new Person("Mary", 28);
        Person john = new Person("John", 22);
        Person linda = new Person("Linda", 26);
        Person james = new Person("James", 32);
        Person jamesBis = new Person("James", 26);

        Comparator<Person> cmpNameAge =
                Comparator.comparing(Person::getName)
                        .thenComparing(Person::getAge);

        System.out.println("cmpName");
        System.out.println("Mary > John : " + (cmpNameAge.compare(mary, john) > 0));
        System.out.println("John > James : " + (cmpNameAge.compare(john, james) > 0));
        System.out.println("Linda > John : " + (cmpNameAge.compare(linda, john) > 0));
        System.out.println("James > JamesBis : " + (cmpNameAge.compare(james, jamesBis) > 0));

    }

    private static void example1() {

        Person mary = new Person("Mary", 28);
        Person john = new Person("John", 22);
        Person linda = new Person("Linda", 26);
        Person james = new Person("James", 32);

        Function<Person, String> getName = Person::getName;

        Comparator<Person> cmpName = Comparator.comparing(getName);
        Comparator<Person> cmpNameReversed = cmpName.reversed();

        System.out.println("cmpName");
        System.out.println("Mary > John : " + (cmpName.compare(mary, john) > 0));
        System.out.println("John > James : " + (cmpName.compare(john, james) > 0));
        System.out.println("Linda > John : " + (cmpName.compare(linda, john) > 0));

        System.out.println("\ncmpNameReversed");
        System.out.println("Mary > John : " + (cmpNameReversed.compare(mary, john) > 0));
        System.out.println("John > James : " + (cmpNameReversed.compare(john, james) > 0));
        System.out.println("Linda > John : " + (cmpNameReversed.compare(linda, john) > 0));

    }

    private static void example2() {

        Person mary = new Person("Mary", 28);
        Person john = new Person("John", 22);
        Person linda = new Person("Linda", 26);
        Person james = new Person("James", 32);
        Person jamesBis = new Person("James", 26);

        Function<Person, String> getName = Person::getName;
        Function<Person, Integer> getAge = Person::getAge;

        Comparator<Person> cmpName = Comparator.comparing(getName);
        Comparator<Person> cmpAge = Comparator.comparing(getAge);

        Comparator<Person> cmpNameAge = cmpName.thenComparing(cmpAge);


        System.out.println("cmpName");
        System.out.println("Mary > John : " + (cmpNameAge.compare(mary, john) > 0));
        System.out.println("John > James : " + (cmpNameAge.compare(john, james) > 0));
        System.out.println("Linda > John : " + (cmpNameAge.compare(linda, john) > 0));
        System.out.println("James > JamesBis : " + (cmpNameAge.compare(james, jamesBis) > 0));

    }

}
