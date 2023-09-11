class B extends Object{
    String name;
    int price;
}

public class obj_and_hashcode {

    public static void main(String[] args){
        B obj = new B();
        obj.name = "First";
        obj.price = 1000;
    
        System.out.println(obj);
        // My output was : B@4617c264

        // Understand that every class you create in java, inherits / extends
        // another class (Object class) under the hood and this Object class has some methods in it. One of which is toString().
        // When you print a object to the console, java automatically calls the .toString() method.


        //Below is the toString() method of Object class. I copied it from the Object.java file where it was written for me to understand what goes on underhood.
        // Trust me, I'm a big fan of Abstraction but don't do it to me haha!!!

        // public String toString() {
        //     return getClass().getName() + "@" + Integer.toHexString(hashCode());
        // }

    }

    
}
