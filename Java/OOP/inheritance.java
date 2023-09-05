public class inheritance {
    public static void main(String[] args){
        AdvCalc obj = new AdvCalc();

        int num1 = obj.add(5, 10);
        int num2 = obj.sub(15, 5);
        int num3 = obj.mul(3, 5);
        int num4 = obj.mod(10, 3);
        int num5 = obj.power(10);
        int num6 = obj.div(10, 5);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
    }
}
