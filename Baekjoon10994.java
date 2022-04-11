import java.util.*;
import java.io.*;

public class Baekjoon10994 {
    static int[][] arr;
    
    static void printSq(int cnt, int x, int y) {
        if(cnt == 0) {
            return; 
        }
        
        int len = (cnt-1)*4+1;
        
        for(int i = x; i < x+len; i++) {
            arr[y][i] = 1;
            arr[i][x] = 1;
            arr[y+len-1][i] = 1;
            arr[i][x+len-1] = 1;
        }
        
        printSq(cnt-1, x+2, y+2);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        arr = new int[(n-1)*4 + 1][(n-1)*4 + 1];
        printSq(n, 0, 0);
        
        for(int i = 0; i < (n-1)*4+1; i++) {
            for(int j = 0; j < (n-1)*4+1; j++) {
                if(arr[i][j] == 1) bw.write("*");
                else bw.write(" ");
            }
            bw.write("\n");
        }
        
        bw.flush();
        br.close();
    }
}