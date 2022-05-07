import java.util.*;
import java.io.*;

public class Baekjoon1541 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        String str = br.readLine();
        
        String num = "";
        int n = 0;
        int sum = 0;
        int min = 0;
        Boolean chk = true;
        
        for(int i = 0; i < str.length(); i++) {
        	if(str.charAt(i) == '+') {
        		n = Integer.parseInt(num);
        		if(chk) sum += n;
        		else min += n;
        		num = "";
        	}else if(str.charAt(i) == '-') {
        		n = Integer.parseInt(num);
        		if(chk) {
        			sum += n;
        			chk = false;
        		}
        		else {
        			sum -= min + n;
        			min = 0;
        		}
        		num = "";
        	}else {
        		num += str.charAt(i); 
        		
        		if(i == str.length()-1) {
        			if(chk) sum += Integer.parseInt(num);
        			else {
        				
        				sum -= min + Integer.parseInt(num);
        			}
        		}
        	}
        	System.out.println("sum : " + sum);
        	System.out.println("min : " + min);
        	System.out.println("num : " + num);
        	System.out.println("-----------------");
        }
        
        System.out.println(sum);
        
        bw.flush();
        br.close();
    }
}