package basic100;
import java.util.Scanner;

public class codeup1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                System.out.println(i+" "+j);
            }
        }

    }
}
