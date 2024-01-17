import java.util.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("Ainur", "Luchaya", "Boss", 8545.623));
        people.add(new Student("Madina", "Neochen", 1));
        people.add(new Student("Alina", "Krasotka", 2.1));
        people.add(new Employee("Nurlan", "Sagyntaev", "Driver", 90000.00));

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}

