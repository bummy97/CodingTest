package basic100;
import java.util.Scanner;

public class codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float n = (float)(a+b+c)/3;

        System.out.println(a+b+c);
        System.out.println(String.format("%.1f", n));
        sc.close();

        
    }
}
