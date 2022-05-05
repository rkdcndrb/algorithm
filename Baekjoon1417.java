import java.util.*;
import java.io.*;

public class Baekjoon1417 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());

        if(n < 2) {
        	System.out.println(0);
        }else {
        	int[] arr = new int[n - 1];
            
            for(int i = 0; i < n - 1; i++) {
            	arr[i] = Integer.parseInt(br.readLine());
            }
            
            getSumScore(dasom, arr);
        }
        
        bw.flush();
        br.close();
    }
    
    static void getSumScore (int dasom, int[] arr) {
    	int sum = 0, max = 0;
        while(true) {
    	   Arrays.sort(arr);
	       	max = arr[arr.length - 1];
	       	
	       	if(max >= dasom) {
	       		sum += 1;
		   		dasom += 1;
		   		arr[arr.length - 1] = max - 1;
	       	}else{
	       		break;
	       	}
	   		
        }
        
        System.out.println(sum);
    }
    
}