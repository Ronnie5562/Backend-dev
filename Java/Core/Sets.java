import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Sets { 
    // Sets is java has the same concept as set in python.  
    public static void main(String[] args){
        Set<Integer> numSet = new HashSet<Integer>(); // Hashset is the generic implementation of set. To make the values in the Set sorted, you can use  TreeSet ==> `new TreeSet<Integer>();`
        numSet.add(2);
        numSet.add(4);
        numSet.add(6);
        numSet.add(8);
        numSet.add(10);
        numSet.add(12);

        for (int i : numSet){
            System.out.println(i);
        }

        // We can also work with iterators
        Iterator<Integer> values = numSet.iterator();
        System.out.println(values);

        while (values.hasNext()) {
            System.out.println(values.next());
        }

    }
}