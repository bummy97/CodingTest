package basic100;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class codeup1084{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String list[] = br.readLine().split(" ");
        int count = 0;

        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);
        int c = Integer.parseInt(list[2]);



        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                for(int k=0; k<c; k++){
                    bw.write(i+" "+j+" "+k+"\n");
                    count++;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();


    }
}