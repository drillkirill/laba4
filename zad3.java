import java.util.*;
import static java.lang.Math.*;
import java.lang.Math.*;
// v=1/6Пh^3+1/2П(r1^2+r2^2)h

public class zad3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double h, r1, r2, v;
        System.out.println("Введите высоту слоя h:");
        h = in.nextDouble();
        System.out.println("Введите радиусы (r1 r2) через пробел:");
        r1 = in.nextDouble();
        r2 = in.nextDouble();
        v = (Math.PI * pow(h, 3)) / 6 + Math.PI * (pow(r1, 2) + pow(r2, 2)) * h / 2;
        System.out.println("V=" + v);
    }

}