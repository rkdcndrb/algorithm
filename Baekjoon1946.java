import java.util.*;
import java.io.*;

public class Baekjoon1946 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        int t = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        int n = 0;
        int cnt = 0;
        for(int i = 0; i < t; i++) {
        	cnt = 1;
        	n = Integer.parseInt(br.readLine());
        	int[][] arr = new int[n][2];
        	
        	for(int j = 0; j < n; j++) {
        		st = new StringTokenizer(br.readLine());
        		arr[j][0] = Integer.parseInt(st.nextToken());
        		arr[j][1] = Integer.parseInt(st.nextToken());
        	}
        	Arrays.sort(arr, new Comparator<int[]>() { // 다차원 배열 오름차순 정
        		@Override
        		public int compare(int[] o1, int[] o2) {
        			if(o1[0] == o2[0]) {
        				return o1[1] - o2[1];
        			}else {
        				return o1[0] - o2[0];
        			}
        		}
        	});
        	
        	int min = arr[0][1]; //앞의 성적으로 오름차순 정렬했으므로 두번 째 성적만 비교
        	for(int k = 1; k < n; k++) { //제일 처음 성적은 무조건 채용 가능이므로 두번째부터 비
        		if(arr[k][1] < min) { //위의 성적보다 자기 성적이 더 좋으므로 비교 성적 교
        			cnt++;
        			min = arr[k][1];
        		}
        	}
        	
        	list.add(cnt);
        }
        
        for(int num : list) {
        	bw.write(num + "\n");
        }
        
        bw.flush();
        br.close();
    }
}