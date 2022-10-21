import java.util.*;

public class zad5 {
    public static double proX(double x1, double y1, double x2, double y2, double x, double y) {
        double ox = x1 - x2;
        double oy = y1 - y2;
        double ob = (x - x2) * ox + (y - y2) * oy;
        double odb = ox * ox + oy * oy;
        double t = ob / odb;
        return x2 + oy * t;
    }

    public static double proY(double x1, double y1, double x2, double y2, double x, double y) {

        double ox = x1 - x2;
        double oy = y1 - y2;
        double ob = (x - x2) * ox + (y - y2) * oy;
        double odb = ox * ox + oy * oy;
        double t = ob / odb;
        return y2 + ox * t;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double x1, y1, x2, y2, x, y;
        System.out.println("Введите координаты (x1 y1) первой точки через пробел:");
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        System.out.println("Введите координаты (x2 y2) второй точки через пробел:");
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        System.out.println("Введите координаты (x y) произвольной точки через пробел:");
        x = in.nextDouble();
        y = in.nextDouble();
        System.out.println(
                "Координаты проекции точки на прямую: (" + proX(x1, y1, x2, y2, x, y)
                        + ";"
                        + proY(x1, y1, x2, y2, x, y) + ")");

    }
}
