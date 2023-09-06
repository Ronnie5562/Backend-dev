public class inheritance {
    public static void main(String[] args){
        SciCalc obj = new SciCalc();

        int num1 = obj.add(5, 10);
        int num2 = obj.sub(15, 5);
        int num3 = obj.mul(3, 5);
        int num4 = obj.mod(10, 3);
        int num5 = obj.power(10);
        int num6 = obj.div(10, 5);
        double num7 = obj.cos(60);
        double num8 = obj.sin(60);
        double num9 = obj.tan(45);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(num8);
        System.out.println(num9);
    }
}
