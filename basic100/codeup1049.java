package basic100;
import java.util.Scanner;

public class codeup1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if(a>b){
            System.out.println("1");
        }else if(a<=b){
            System.out.println("0");
        }
    }
}
