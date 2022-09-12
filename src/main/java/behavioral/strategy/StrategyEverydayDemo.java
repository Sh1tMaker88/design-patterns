package behavioral.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyEverydayDemo {

    private static void printContents(List < Person > people){
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }

    public static void main(String[] args) {
        Person bryan = new Person("Bryan", "801-555-1212", 39);
        Person mark = new Person("Mark", "801-444-1212", 41);
        Person chris = new Person("Chris", "801-333-1212", 38);

        List<Person> people = new ArrayList<>();
        people.add(bryan);
        people.add(mark);
        people.add(chris);
        System.out.println("Not sorted");
        printContents(people);

        Collections.sort(people, (o1, o2) -> {
            if (o1.getAge() > o2.getAge()) {
                return 1;
            }
            if (o1.getAge() < o2.getAge()) {
                return -1;
            }
            return 0;
        });
        System.out.println("\nSorted by age");
        printContents(people);

        Collections.sort(people, Comparator.comparing(Person::getName));
        System.out.println("\nSorted by name");
        printContents(people);
    }
}
