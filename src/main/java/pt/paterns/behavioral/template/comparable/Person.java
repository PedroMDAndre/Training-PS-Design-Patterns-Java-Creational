package pt.paterns.behavioral.template.comparable;

public record Person(String name,
                     String phoneNumber,
                     int age) implements Comparable<Person> {

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }

}
