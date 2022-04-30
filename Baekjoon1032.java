import java.util.*;
import java.io.*;

public class Baekjoon1032 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
        	list.add(br.readLine());
        }
        
        Character[] arr = new Character[list.get(0).length()];
        for(int j = 0; j < list.get(0).length(); j++) {
        	char c = list.get(0).charAt(j);
        	Boolean chk = true;
        	for(int k = 0; k < list.size(); k++) {
        		if(list.get(k).charAt(j) != c) chk = false;
        	}
        	if(chk) arr[j] = c;
        }
        
        for(int l = 0; l < arr.length; l++) {
        	if(arr[l] == null) System.out.print("?");
        	else System.out.print(arr[l]); 
        }
        
        bw.flush();
        br.close();
    }
}