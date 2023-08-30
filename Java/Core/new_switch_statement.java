public class new_switch_statement {
    public static void main(String[] args) {

        int dayNum = 2;
        String day = "";


        // This is new switch syntax introduced in Java 12.
        // It pretty much looks better than the previous version
        day = switch(dayNum)
        {

            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "INVALID: Input a valid dayNum [1 - 7]";

        }; // NOTE: You have to , add a semi-colon here because the above is not just a block but an expression like every other java code.

        System.out.println(day);
    }
}
