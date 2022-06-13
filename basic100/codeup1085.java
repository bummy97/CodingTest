package basic100;
import java.util.Scanner;

public class codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        float result = (float)a*b*c*d/1024/1024/8;

        System.out.printf("%.1f MB", result);

        sc.close();
    }
}
