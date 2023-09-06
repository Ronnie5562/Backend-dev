public class SciCalc extends AdvCalc {
    public double cos(int n){
        double res = Math.toRadians(n);
        return Math.cos(res);
    }

    public double sin(int n){
        double res = Math.toRadians(n);
        return Math.sin(res);
    }

    public double tan(int n){
        double res = Math.toRadians(n);
        return Math.tan(res);
    }

    public static void main(String[] args){
        SciCalc obj = new SciCalc();

        System.out.println(obj.sin(30));
        System.out.println(obj.cos(30));
        System.out.println(obj.tan(45));

    }

}
