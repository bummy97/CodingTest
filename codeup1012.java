import java.util.Scanner;
public class codeup1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        String b = String.format("%.6f", a);
        sc.close();

        System.out.println(b);
    }
}
