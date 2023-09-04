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
    }
}
