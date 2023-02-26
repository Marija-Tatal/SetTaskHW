package Class29;

import java.util.LinkedHashSet;

public class HW29ClassTask {
    public static void main(String[] args) {
        /*
        Create a Set of cities in which you want to make sure that insertion order is maintained.
         Then remove any city that starts with “A”;

         */

        LinkedHashSet<String> cities= new LinkedHashSet<>();
        cities.add("Milano");
        cities.add("Amsterdam");
        cities.add("New York");
        cities.add("Athens");
        cities.add("Berlin");
        cities.add("Ankara");
        cities.add("Zagreb");
        cities.add("Oslo");

        cities.removeIf(city->city.startsWith("A"));
        System.out.println( cities);
    }

}
