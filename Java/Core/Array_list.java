import java.util.ArrayList;
import java.util.List;

public class Array_list {
    public static void main(String[] args){
        System.out.println("Hello");

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(nums.get(4));

        for (int i : nums){
            System.out.println(i);
        }
    }
}