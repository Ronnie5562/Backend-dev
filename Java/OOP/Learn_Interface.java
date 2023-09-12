interface Computer {
    void build();
}


class Desktop implements Computer {
    public void build(){
        System.out.println("Code, Compile, Run, Test, Deploy !!! ==> Faster");
    }
}


class Laptop implements Computer {
    public void build(){
        System.out.println("Code, Compile, Run, Test, Deploy !!!");
    }
}


class Developer {
    public void devApp(Computer lap){
        lap.build();
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