import java.util.Scanner;
public class codeup1035{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        int num = Integer.parseInt(a, 16);

        System.out.println(Integer.toOctalString(num));
    }
}