import java.util.*;
import java.lang.*;
public class Gravitacija {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double visina = sc.nextInt();

        System.out.println(izracun(visina));
        System.out.println("OIS je zakon!");
    }
    public static double izracun(double v) {
        double C = Math.pow(6.674*10, -11);
        double M = Math.pow(5.972*10, 24);
        double r = Math.pow(6.371*10, 6);
        double a = (C*M)/((r+v)*(r+v));
        return a;
    }
}