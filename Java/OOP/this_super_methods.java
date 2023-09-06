// In this file. I demonstarate my knowledge gained on this() and super() methods from my course
/* 
 * this() - it is present in every constructor object of a class (under-the-hood). It is reference to the constructor of that class
 * super() - it is present in every constructor object of a class (under-the-hood). It is reference to the constructor of the parent class of that class.
 * NOTE: Every class in java inherits from the Object class.
*/
class A
{
    public A(){
        System.out.println("in A");
    }
    public A(int n){
        this();
        System.out.println("in int A");
    }
}

class B extends A
{
    public B(){
        super(10); // This calls the constructor method in its super class (which is A in this case)  that accepts one argument.
        System.out.println("in B");
    }
    public B(int n){
        this(); // This calls the constructor method above - because there is are no arguments
        System.out.println("in int B");
    }
}


public class this_super_methods {
    public static void main(String[] args) {
        B obj = new B(10);
        // System.out.println(obj);
    }
}
