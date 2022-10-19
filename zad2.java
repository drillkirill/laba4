
//h = V₀²*R²/2*G*m
import java.util.*;
import static java.lang.Math.*;

public class zad2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double v, r, m, h;
        System.out.print("Введите массу планеты");
        m = in.nextDouble();
        System.out.print("Введите массу скорость");
        v = in.nextDouble();
        System.out.print("Введите радиус планете");
        r = in.nextDouble();
        h = pow(v, 2) * pow(r, 2) / 2 * 9.8 * m;
        System.out.print("h = " + h);
    }
}