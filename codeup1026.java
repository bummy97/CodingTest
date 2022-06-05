import java.util.Scanner;
public class codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String list[] = sc.next().split(":");
        sc.close();

        if(list[1].equals("00")){
            System.out.println("0");
        }else{
            System.out.println(list[1]);
        }
        


    }
}
