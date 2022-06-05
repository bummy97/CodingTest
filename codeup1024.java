import java.util.Scanner;
public class codeup1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String list[] = sc.nextLine().split("");
        sc.close();

        for(int i=0; i<list.length; i++){
            System.out.println("\'"+list[i]+"\'");
        }
    }
}
