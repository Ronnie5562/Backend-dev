// enum is a class and it's inner elements are ojects

enum Status { // Status is the class here, and Running, Failed, Pending, Success are all objects
    Running, Failed, Pending, Success;
}

enum Laptop {
    MacBook(2000), IdeaPad(1200), ThinkPad(1500), EduPad, Surface(1800);

    private int price;

    private Laptop(){
        this.price = 500;
    }

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void getPrice(int price){
        this.price = price;
    }
}


public class learn_enum {

    public static void showall(){
        Status[] A = Status.values();

        for (Status s : A){
            System.out.println(s + " - " + s.ordinal());
        }
    }

    public static void if_else(){
        Status curr = Status.Failed;

        if (curr == Status.Running)
            System.out.println("All good");
        else if (curr == Status.Failed)
            System.out.println("Try Again");
        else if (curr == Status.Pending)
            System.out.println("Please Wait");
        else if (curr == Status.Success)
            System.out.println("Success");
        else
            System.out.println("Something went wrong !!!");
    }

    public static void enum_switch(){
        Status curr = Status.Running;

        switch (curr) {
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            case Success:
                System.out.println("Success");
                break;       
            default:
                System.out.println("Something went wrong !!!");
                break;
        }
    }

    
    public static void enum_new_switch(){
        Status curr = Status.Success;
        
        switch (curr) {
            case Running -> System.out.println("All good");
            case Failed -> System.out.println("Try Again");
            case Pending -> System.out.println("Please Wait");
            case Success -> System.out.println("Success");
            default -> System.out.println("Something went wrong !!!");
        }
    }
    
    public static void show_status(){
        learn_enum.showall();

        System.out.println();

        learn_enum.if_else();

        System.out.println();

        learn_enum.enum_switch();

        System.out.println();

        learn_enum.enum_new_switch();
    }

    public static void show_laptop() {
        Laptop[] lap_list = Laptop.values();

        for (Laptop lap : lap_list){
            System.out.println("A/An " + lap + " costs " + lap.getPrice());
        }
    }

    public static void main(String[] args){
        // learn_enum.show_status();
        learn_enum.show_laptop();

    }
}
