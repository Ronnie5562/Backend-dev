import java.io.IOException;

public class getInput {
    public static void main(String[] args){
        System.out.print("Enter an integer: ");

        try {
            int num = System.in.read();
            System.out.println(num - 48); //The default output is the ASCII value of the integer the usr inputs. You can solve this error by subtracting 48 from the actual value because te ASCII value of number starts from 48(where 0=48).
        } catch (IOException error)
        {
            System.out.println("Something went wrong with your IO");
        }
        catch (Exception error){
            System.out.println("An unknown Exception(Runtime error) occured");
        }
    }
}
