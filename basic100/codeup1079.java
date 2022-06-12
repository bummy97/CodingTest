package basic100;
import java.util.Scanner;

public class codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        String str[] = a.split(" ");
        String s = "q";

        for(int i =0; i<str.length; i++){
            System.out.println(str[i]);

            if(str[i].equals(a)){
                break;
            }
        }
        sc.close();
    }
}
