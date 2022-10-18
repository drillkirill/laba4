import java.util.*;
import static java.lang.Math.*;

public class zad1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double t, y, R;
        System.out.print("Введите переменную t");
        t = in.nextDouble();
        System.out.print("Введите переменную y");
        y = in.nextDouble();
        R = (pow(Math.sin(2 * t + 1), 2) + 0.3 * t) / (Math.log10(t * y + 0.8 * y) - pow(E, 2));
        System.out.print("R = " + R);
    }
    static {
        Scanner in = new Scanner(System.in);
        double x, y, z, L;
        System.out.print("Введите переменную x");
        x = in.nextDouble();
        System.out.print("Введите переменную z");
        z = in.nextDouble();
        System.out.print("Введите переменную y");
        y = in.nextDouble();
        L = (x*z + (y*z)/(pow(x,2)+4*x+E))*((2*x+y)/(pow(E,2*pow(z, 2)))+Math.tan(Math.cos(Math.sin(x+z+y))));
        System.out.print("L = " + L);
    }
}

