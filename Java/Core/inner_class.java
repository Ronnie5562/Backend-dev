class Outer {

    public void show(){
        System.out.println("In Outer class");
    }

    class Inner {
        public void show(){
            System.out.println("In Inner class");
        }
    }

    static class static_Inner {
        public void show(){
            System.out.println("In static_Inner class");
        }
    }
}

public class inner_class {
    public static void main(String[] args){
        // Create an instance ou Outer
        Outer obj = new Outer();

        // Create an instance of Inner
        Outer.Inner obj1 = obj.new Inner();

        // Let's use another syntax, but for this to work, the inner class should be a static class
        Outer.static_Inner obj2 = new Outer.static_Inner();

    }
}
