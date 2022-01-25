package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainForSet {

    public static void main(String...args) {
        Set<Person> sortedSet = new TreeSet<>();
        Set<Person> hashSet = new HashSet<>();
        Set<Person> orderSet = new LinkedHashSet<>();

        sortedSet.addAll(List.of(new Person[]{new Person(7), new Person(2), new Person(0), new Person(10), new Person(0)}));
        hashSet.addAll(List.of(new Person[]{new Person(7), new Person(2), new Person(0), new Person(10), new Person(0)}));
        orderSet.addAll(List.of(new Person[]{new Person(7), new Person(2), new Person(0), new Person(10), new Person(0)}));

        System.out.println(sortedSet);
        System.out.println(hashSet);
        System.out.println(orderSet);
    }

}
