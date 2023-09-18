import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class getInput {
    public static void main(String[] args){
        System.out.print("Enter an integer: ");

        
        try {
            //                 Method 1
            // int num = System.in.read(); ==> This reads in only one character.
            // System.out.println(num - 48); The default output is the ASCII value of the integer the usr inputs. You can solve this error by subtracting 48 from the actual value because te ASCII value of number starts from 48(where 0=48).

            //                 Method 2
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader bfreader = new BufferedReader(in);

            int num = Integer.parseInt(bfreader.readLine());
            System.out.println(num); //The default output is the ASCII value of the integer the usr inputs. You can solve this error by subtracting 48 from the actual value because te ASCII value of number starts from 48(where 0=48).
        } catch (IOException error)
        {
            System.out.println("Something went wrong with your IO");
        }
        catch (Exception error){
            System.out.println("An unknown Exception(Runtime error) occured");
        }

        //                   Method 3 (Using Scanner) ==> Best Approach

        System.out.print("Enter another integer: ");
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();


        System.out.println(num);

        Sc.close();
    }
}
