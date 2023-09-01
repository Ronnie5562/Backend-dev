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


        //  Multidimensional array
        int multiplenums[][] = new int[5][5];

        for (int i = 0; i <= 4; i++) {

            for (int j = 0; j <= 4; j++){
                System.out.print(multiplenums[i][j] + " ");
            }
            System.out.println();
        }


        int multiplenums2[][] = new int[5][5];

        for (int i = 0; i <= 4; i++) {

            for (int j = 0; j <= 4; j++){
                multiplenums2[i][j] = (int)(Math.random() * 100);
                System.out.print(multiplenums2[i][j] + " ");
            }
            System.out.println();
        }


        // Jagged Array: A jagged array is an array of arrays such that member arrays can be of different sizes, 
        // i.e., we can create a 2-D array but with a variable number of columns in each row.

        int jaggedArray[][] = new int[4][];
        jaggedArray[0] = new int[] { 12, 2, 3 }; // Initialize the first inner array
        jaggedArray[1] = new int[] { 13, 2, 33, 42, 45, 67 }; // Initialize the second inner array
        jaggedArray[2] = new int[] { 54, 67, 311, 4 }; // Initialize the third inner array
        jaggedArray[3] = new int[] { 1, 2, 3, 4 }; // Initialize the fourth inner array
        jaggedArray[3][0] = 10;


        for (int i = 0; i <= 3; i++) {

            for (int j = 0; j < jaggedArray[i].length; j++){
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}