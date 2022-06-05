import java.util.Scanner;
public class codeup1033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a10 = sc.nextInt();
        String a16U = Integer.toHexString(a10).toUpperCase();
        sc.close();

        System.out.println(a16U);   
    }
}
