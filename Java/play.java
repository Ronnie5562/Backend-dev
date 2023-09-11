class A {
    public void show(){
        System.out.println("show method in class A");
    }
}

class B extends A {
    public void show(){
        System.out.println("show method in class B");
    }
}

public class play {
    public static void main(String[] args){
        A obj = new B(); //Using polymorphism
        obj.show();
    }
}