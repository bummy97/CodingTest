package basic100;
import java.util.Scanner;

public class codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;

        for(int i=0; i<=a; i++){
            if(i%2==0){
                count += i;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
