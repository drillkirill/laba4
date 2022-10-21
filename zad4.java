import java.util.*;

public class zad4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y;
        System.out.println("Введите трехзначное число:");
        x = in.nextInt();
        y = Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
        System.out.println(y);
    }
}
