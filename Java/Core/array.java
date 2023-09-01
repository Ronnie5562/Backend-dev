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


    }
}
