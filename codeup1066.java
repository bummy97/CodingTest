import java.util.Scanner;

public class codeup1066 {

    public static void evenorodd(int num){
        if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        evenorodd(a);
        evenorodd(b);
        evenorodd(c);
    }
}
