class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++) {
            String str = String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr1[i]|arr2[i])));
            str = str.replaceAll("1", "#").replaceAll("0"," ");
            answer[i] = str;
        }
        
        return answer;
    }
}