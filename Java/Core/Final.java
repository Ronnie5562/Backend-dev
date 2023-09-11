// The final keyword has different use case in variables, methods and classes.
// 1. Variables: Syntax ==> final int A = 10;
//      When the final keyword is used in front of a variable, the variable becomes a constant.
// 2. method: Syntax ==> final void show(){} e.t.c
//      When the final keyword is used in front of a method, the method cannot be overriding by another method. 
// 3. class: Syntax ==> final class text {}
//      When the final keyword is used in front of a class, the class cannot be inherited by another class. 



class X {
    final int A = 10; // This variable can never change. i.e it is a constant variable.

    final void talk(){
        System.out.println("This method cannot be overriden");
    }
}

final class Y {
    // This class cannot extended/inherited by another class.
}


public class Final{
    public static void main(String[] args){
        System.out.println("Learning about the final keyword !!!");
    }
}