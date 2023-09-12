interface Gadgets {
    
}

interface Devices {
    void OFF();
    void ON();
}


interface Computer extends Devices {
    void build();
}



class Desktop implements Computer, Gadgets { // Interfaces, sort of forces the concept of multiple inheritance into Java which is not originally there !!!
    public void build(){
        System.out.println("Code, Compile, Run, Test, Deploy !!! ==> Faster");
    }

    public void ON(){
        System.out.println("Booting device (Desktop) .....");
        System.out.println("Successfully Logged in ");
    }

    public void OFF(){
        System.out.println("Logging out .....");
        System.out.println("Switching off .....");
    }

}


class Laptop implements Computer, Gadgets {
    public void build(){
        System.out.println("Code, Compile, Run, Test, Deploy !!!");
    }

    public void ON(){
        System.out.println("Booting device (Laptop) .....");
        System.out.println("Successfully Logged in ");
    }

    public void OFF(){
        System.out.println("Logging out .....");
        System.out.println("Switching off .....");
    }

}


class Developer {
    public void devApp(Computer lap){
        lap.ON();
        lap.build();
        lap.OFF();
    }
}


public class Learn_Interface {
    public static void main(String[] args){
        Developer Ronald = new Developer();
        Computer lap = new Laptop();
        Computer desk = new Desktop();


        Ronald.devApp(desk);
        Ronald.devApp(lap);
    }
}