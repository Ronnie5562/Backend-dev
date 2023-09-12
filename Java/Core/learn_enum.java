enum Status {
    Running, Failed, Pending, Success;
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

    public static void main(String[] args){
        learn_enum.showall();

        System.out.println();

        learn_enum.if_else();

        System.out.println();

        learn_enum.enum_switch();

        System.out.println();

        learn_enum.enum_new_switch();
    }
}
