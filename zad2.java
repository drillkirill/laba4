
//h = V₀²*R²/2*G*m
import java.util.*;
import static java.lang.Math.*;

public class zad2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double v, r, m, h;
        System.out.println("Введите массу планеты:");
        m = in.nextDouble();
        System.out.println("Введите скорость:");
        v = in.nextDouble();
        System.out.println("Введите радиус планеты:");
        r = in.nextDouble();
        h = (pow(v, 2) * pow(r, 2) * 10 * m) / 2;
        System.out.println("h = " + h);
    }
}