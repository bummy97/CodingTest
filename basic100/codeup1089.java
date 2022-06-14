package basic100;
import java.util.Scanner;

public class codeup1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a;

        for(int i=1; i<c; i++){
            sum += b;
        }
        System.out.println(sum);
        sc.close();
    }
}
