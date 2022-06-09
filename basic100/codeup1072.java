package basic100;
import java.util.Scanner;

public class codeup1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int list[] = new int[a];

        for(int i=0; i<a; i++){
            list[i] = sc.nextInt(); 
        }

        for(int i=0; i<list.length; i++){
            System.out.println(list[i]);
        }

        sc.close();
    }
}
