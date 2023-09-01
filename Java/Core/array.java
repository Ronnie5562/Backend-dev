public class array {
    public static void main(String[] args) {

        // initializes an array that can contain four int values
        int nums[] = new int[10];
        System.out.println(nums[0]);

        // An array of the ints 1 - 10
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i <= 9; i++){

            System.out.println(arr[i] * arr[i]);
        }
    }
}
