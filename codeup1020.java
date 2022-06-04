import java.util.Scanner;
public class codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num[] = sc.next().split("-");
        sc.close();
        String num1 = num[0];
        String num2 = num[1];

        System.out.println(num1+num2);
    }
}
