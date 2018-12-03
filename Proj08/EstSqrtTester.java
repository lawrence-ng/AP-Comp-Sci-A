public class EstSqrtTester {

    //Your estSqrt method goes here
    public static double estSqrt(double a)
    {
        double x = a/2;
        while(x*x - a > 0.0001 || x*x - a < -0.0001)
        {
            x = (x + a / x)/2;
        }
        return x;
    }

    public static void main(String[] args) {

        double num;

        for (int i = 0; i < 3; i++) {

            num = Math.random()*Math.pow(10,(Math.random()*4));

            System.out.printf("Square root of %7.2f is %7.2f\n", num, estSqrt(num));

        }

    }

}