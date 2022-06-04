import java.util.Scanner;
public class codeup1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time[] = sc.next().split("\\.");
        sc.close();
        int year = Integer.parseInt(time[0]);
        int month = Integer.parseInt(time[1]);
        int day = Integer.parseInt(time[2]); 
        
        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}
