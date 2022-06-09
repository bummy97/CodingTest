package basic100;
import java.util.Scanner;

public class codeup1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while(a>0){
            --a;
            System.out.println(a);
        }
        sc.close();
    }
}
