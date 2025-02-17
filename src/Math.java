import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double x = sc.nextDouble();
        while (x < 0) {
            System.out.print("x is negative, try again: ");
            x = sc.nextDouble();
        }
        double sqrt = java.lang.Math.sqrt(x);
        System.out.printf("sqrt = %.2f", sqrt);

        double ceil = java.lang.Math.ceil(x);
        double floor = java.lang.Math.floor(x);
        System.out.println("\nceil = " + ceil + ", floor = " + floor);

        double sin = java.lang.Math.sin(x); double cos = java.lang.Math.cos(x); double tan = java.lang.Math.tan(x);
        System.out.printf("sin = %.2f, cos = %.2f, tan = %.2f", sin, cos, tan);
        
    }
}
