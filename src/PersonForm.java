import java.util.HashSet;
import java.util.Set;

public class PersonForm {

    public static void main(String[] args) {

        Set<Person> people = new HashSet<>();

        people.add(new Person("Joao", 25));
        people.add(new Person("Maria", 30));
        people.add(new Person("Pedro", 22));
        people.add(new Person("Joao", 25));
        people.add(new Person("Maria", 30));
        people.add(new Person("Ana", 28));

        System.out.println("=== Registered People ===");

        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("\nTotal people registered: " + people.size());

        System.out.println("\n=== Explanation ===");

        System.out.println("The HashSet does not allow duplicate elements.");

        System.out.println("The hashCode() method helps identify where an object should be stored.");

        System.out.println("The equals() method determines whether two objects are equal based on their attributes.");

        System.out.println("When two objects have the same hash code, equals() checks whether they are actually equal.");

        System.out.println("People with the same name and age were considered duplicates and were not added.");
    }
}
