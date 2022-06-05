import java.util.Scanner;
public class codeup1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String list [] = sc.next().split("\\.");
        sc.close();

        int year = Integer.parseInt(list[0]);
        int month = Integer.parseInt(list[1]);
        int day = Integer.parseInt(list[2]);

        System.out.printf("%02d-%02d-%04d", day, month, year);
        
    } 
}
