public class loops {
    public static void main(String[] args){
        System.out.println("Let's learn about loops in Java");
        System.out.println("In this module, we're going to be looking at three different kinds of loops");


        System.out.println("1. While Loop\n");
        System.out.println("Started While Loop....");

        int i = 0;
        while (i <= 4){
            System.out.println("While loop: " + i);
            i++;
        }

        System.out.println("Ended While Loop\n");


        System.out.println("2. Do while Loop\n");
        // Do while is used whenever you want to run the first iteration of your loop regardless of the codition.
        System.out.println("Started do While Loop....");

        int j = 5;
        do{
            System.out.println("do While loop: " + j);
            j++;
        }while (j <= 4);

        System.out.println("Ended do While Loop\n");

        System.out.println("3. For Loop\n");
        System.out.println("Started for Loop....");

        for (int x = 0; x <= 5; x++)
        {
            System.out.println("for loop: " + x);
        }

        System.out.println("Ended for Loop\n");
    }
}
