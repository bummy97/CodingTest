package basic100;
import java.util.Scanner;

public class codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.nextLine().charAt(0);
        sc.close();
        
        for(char i = 'a'; i<=a; i++){
            System.out.print(i+" ");
        }
    }
}
