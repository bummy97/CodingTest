package basic100;
import java.util.Scanner;

public class codeup1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int sum = 0;

        for(int i=1; ; i++){
            sum += i;

            if(sum>=a){
                System.out.println(sum);
                break;
            }
        }
        sc.close();
    }
}
