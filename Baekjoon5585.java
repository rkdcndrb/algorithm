import java.util.*;
import java.io.*;

public class Baekjoon5585 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        
        int won = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        won = 1000 - won;
        if(won / 500 > 0) {
        	cnt += won/500;
        	won -= (won/500 * 500);
        }
        if(won / 100 > 0) {
        	cnt += won/100;
        	won -= (won/100 * 100);
        }
        if(won / 50 > 0) {
        	cnt += won/50;
        	won -= (won/50 * 50);
        }
        if(won / 10 > 0) {
        	cnt += won/10;
        	won -= (won/10 * 10);
        }
        
        if(won / 5 > 0) {
        	cnt += won/5;
        	won -= (won/5 * 5);
        }
        
        if(won / 1 > 0) {
        	cnt += won/1;
        }
        System.out.println(cnt);
        
        bw.flush();
        br.close();
    }
}