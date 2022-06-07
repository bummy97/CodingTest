package basic100;
import java.util.Scanner;

public class codeup1053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        if(a == 0){
            System.out.println("1");
        }else if(a == 1){
            System.out.println("0");
        }
    }
}
