// Anonymous class are classess that do not have a name


class Tesla {
    public void drive(){
        System.out.println("Started driving a Tesla Car");
    }
}

public class Anonymous_class {
    public static void main(String[] args){

        Tesla ModelX = new Tesla();

        // The below is an Anonymous class that extends class Tesla under-the-hood ==> ModelY is an instance of the anonymous class.
        Tesla ModelY = new Tesla(){
            public void drive(){
                System.out.println("Started driving a Tesla ModelY");
            }
        };

        ModelX.drive();

        ModelY.drive();
    }
}
