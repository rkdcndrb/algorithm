import java.util.*;
import java.io.*;

public class Baekjoon1789 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        long s = Long.parseLong(br.readLine());
        long n = 0;
        long sum = 0;
        
        for(long i = 1; i < s; i++) {
            sum += i;
            n++;
            if(sum > s) {
                n--;
                break;
            }
        }
        
        if(s == 1) System.out.println(1);
        else System.out.println(n);
        
        bw.flush();
        br.close();
    }
}