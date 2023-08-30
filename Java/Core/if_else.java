public class if_else
{

    public static void main(String[] args)
    {
        int first = 10;
        int second = 20;
        int third = 30;
    
        if (first > 15){
            System.out.println("We're good. The first value is greater than 15");
        } else if (second > 15) {
            System.out.println("We're good. The second value is greater than 15");
        } else if (third > 15) {
            System.out.println("Almost screwed!! but thankfully, the third value is greater than 15");
        } else {
            System.out.println("Shit, Our three trials failed ");
        }


        // Let's do some tenary stuff

        char result = third > 50 ? 'G' : 'L';

        System.out.println(result);


    }
}
