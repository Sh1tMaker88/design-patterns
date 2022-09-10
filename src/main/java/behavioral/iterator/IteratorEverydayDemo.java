package behavioral.iterator;

import java.util.*;

public class IteratorEverydayDemo {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
        Set<String> names = new HashSet<>();
        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");

        for (String name : names) {
            System.out.println(name);
        }

//        Iterator<String> namesItr = names.iterator();
//
//        while (namesItr.hasNext()) {
//            System.out.println(namesItr.next());
//            namesItr.remove();
//        }

        System.out.println("-------------");
        System.out.println("Names size: " + names.size());
    }
}
