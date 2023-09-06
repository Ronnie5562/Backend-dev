/**
 * When you inherit a class in java, yo also inherit all the variables and methoda from that class. 
 * If you hava a method in the child class that has the same name as a method in the parent class, 
 * preference is given to the method of the child class. This concept is known as method overriding
**/

class A
{
    public void describe(){
        System.out.println("This a class Named A");
    }
}

class B extends A
{
    public void describe(){
        System.out.println("This a class Named B");
    }
}

public class method_overriding {
    public static void main(String[] args){
        B obj1 = new B(); // Notice that preference is given to the describe() method in the child class [ class B ] and [ This a class Named B ] is printed !!!
        obj1.describe();
    } 
}
