import java.util.*;
import java.io.*;

public class Baekjoon2447 {
    static int[][] arr;
    
    static void printSq(int cnt, int x, int y) {
        if(cnt == 1) return;
        
        int len = cnt/3;
        
        for(int k = y; k < y+cnt; k+= len) {
            for(int m = x; m < x+cnt; m += len) {
                printSq(len, m, k);
            }
        }
        
        for(int i = y+len; i < y+(2*len); i++) {
            for(int j = x+len; j < x+(2*len); j++) {
                arr[i][j] = 1;
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        
        printSq(n, 0, 0);
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == 0) bw.write("*"); 
                else bw.write(" ");
            }
            bw.write("\n");
        }
        
        bw.flush();
        br.close();
    }
}