public class string {
    public static void main(String[] args){

        //Java strings can be declared in two different ways

        //1. - This is possible because Java String is not a primitive type but a  Class under-the-hood
        String name = new String("Benita");

        //2. This also works tho
        String name2 = "Ronald";

        System.out.println(name);
        System.out.println(name2);



        //  NOTE: By default, strings in Java are immutable but if you want to get to use mutable strings, you can use - The StringBuffer or StringBuilder class in java
        // 1. StringBuffer

        StringBuffer fullName = new StringBuffer("Abimbola");
        System.out.println(fullName.capacity());
        System.out.println(fullName.length());

        // Capacity is the num of chars that the string has. NOTE: It has 16 extra chars space. In this case, "Rollybobo" has 9 chars plus the default 16 chars, that makes it 25.


        // So, Let's say I made a mistake with my fullName by adding only my lastName without my firstName
        // Let's update it

        fullName.append(" Ronald");
        System.out.println(fullName);

        //.append() is just on of the many methods that StringBuffer provides us. You can explore others based on your needs.

    }
}
