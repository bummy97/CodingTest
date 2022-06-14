package basic100;
import java.util.Scanner;

public class codeup1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
       
        System.out.println(a*(long)(Math.pow(b, c-1)));
        sc.close();
    }
}
