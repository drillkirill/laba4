import java.util.*;
import static java.lang.Math.*;

public class zad1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double t, y, R;
        System.out.println("Введите переменную t");
        t = in.nextDouble();
        System.out.println("Введите переменную y");
        y = in.nextDouble();
        R = (pow(Math.sin(2 * t + 1), 2) + 0.3 * t) / (Math.log(t * y + 0.8 * y) - pow(E, 2));
        System.out.println("R = " + R);
    }

    static {
        Scanner in = new Scanner(System.in);
        double x, y, z, L;
        System.out.println("Введите переменную x");
        x = in.nextDouble();
        System.out.println("Введите переменную y");
        y = in.nextDouble();
        System.out.println("Введите переменную z");
        z = in.nextDouble();
        L = (x * z + (y * z) / (pow(x, 2) + 4 * x + E))
                * ((2 * x + y) / (pow(E, 2 * pow(z, 2))) + Math.tan(Math.cos(Math.sin(x + z + y))));
        System.out.println("L = " + L);
    }
}
