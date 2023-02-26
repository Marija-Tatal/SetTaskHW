package Class29;

import java.util.HashMap;

public class HWclassTask2 {
    public static void main(String[] args) {
        /*
        Create a Set collection that will hold Objects of Student Type.
         In this set we do not care about the insertion order.
         Each student object should have name and studentID. Display name of each student.
         */
        HashMap<String,Integer> students= new HashMap<>();
        students.put("Mila",325);
        students.put("Lora",489);
        students.put("Laura",254);
        students.put("Maxim",323);
        students.put("Novak",180);
        students.put("Zoe",694);


        System.out.println(students.keySet());

    }
}
