package basic100;
import java.util.Scanner;

public class codeup1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] arr1 = new int[count];
        int[] arr2 = new int[24];
        int num = 0;

        for(int i=0; i<count; i++){
            arr1[i] = sc.nextInt();
            num = arr1[i];
            arr2[num]++;
        }

        for(int i=1; i<arr2.length; i++){
            System.out.println(arr2[i]+" ");
        }
        sc.close();

    }
}
