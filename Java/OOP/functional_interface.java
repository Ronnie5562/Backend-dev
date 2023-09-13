// A functional interface in Java is an interface that has only one method in it.

@FunctionalInterface // This annotation ensures that we have only one method inside the interface
interface A{
    void show();
}


class B implements A {
    public void show(){
        System.out.println("IN B SHOW");
    }
}


public class functional_interface {
    A obj = new B();
}