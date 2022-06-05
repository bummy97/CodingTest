import java.util.Scanner;
public class codeup1031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a10 = sc.nextInt();

        String a8 = Integer.toOctalString(a10);

        System.out.println(a8);
    }
}
