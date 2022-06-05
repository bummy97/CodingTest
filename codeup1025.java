import java.util.Scanner;
public class codeup1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String list [] = sc.next().split("");
        sc.close();

        int num [] = new int[list.length];

        for(int i=0; i<num.length; i++){
            num[i] = Integer.parseInt(list[i]);
        }
        System.out.println("[" + num[0]*10000 + "]");
        System.out.println("[" + num[1]*1000 + "]");
        System.out.println("[" + num[2]*100 + "]");
        System.out.println("[" + num[3]*10 + "]");
        System.out.println("[" + num[4] + "]");


    }
}
