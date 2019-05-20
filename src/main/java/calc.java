public class calc {
    public static double div(double x, double y){
        double a = x / y;
        if (y == 0){
            System.out.println(" do not divide by 0");
            return 0;
        }
        else if (a > 12345 ){ //max value
            System.out.println("over the limit");
            return 12345;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(div(123456, 45));
    }
}
