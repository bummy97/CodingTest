package basic100;
import java.util.Scanner;

public class codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        long result = a*b+c;

        if(n==1){
            System.out.println(a);
        }else{
            for(int i=2; i<n; i++){
                result = result * b + c;
            }
            System.out.println(result);
        }
        sc.close();
    }
}
