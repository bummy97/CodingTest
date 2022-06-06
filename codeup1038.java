import java.util.Scanner;
public class codeup1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String list [] = sc.nextLine().split(" ");
        long a = Integer.parseInt(list[0]);
        long b = Integer.parseInt(list[1]);

        System.out.println(a+b);
    }
}
