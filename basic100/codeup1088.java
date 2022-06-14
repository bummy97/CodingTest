package basic100;
import java.util.Scanner;

public class codeup1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i=1; i<=a; i++){
            if(i%3==0){
                continue;
            }else{
                System.out.print(i+" ");
            }

        }
        sc.close();
    }
}
