import java.util.Scanner;
public class codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();

        int b = (int) (a/1);
        float c = (float) (a%1);

        System.out.println(b);
        System.out.println(c);
    }
}
