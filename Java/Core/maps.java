import java.util.HashMap;
import java.util.Map;

public class maps {
    // Map is a collection of key : values pairs. ==> More like dictionaries in python.
    public static void main(String[] args){

        Map<String, Integer> students = new HashMap<String, Integer>(); // To use a synchronised version of HashMap, chechout `Hashtable`

        students.put("Tolu", 95); 
        students.put("Ogaranya", 90); 
        students.put("Shuperu", 85); 
        students.put("Ayomide", 100); 
        students.put("Baron Filou", 95);

        System.out.println(students);

        for (String name : students.keySet()){
            System.out.println(name + " : " + students.get(name));
        }
    }
}