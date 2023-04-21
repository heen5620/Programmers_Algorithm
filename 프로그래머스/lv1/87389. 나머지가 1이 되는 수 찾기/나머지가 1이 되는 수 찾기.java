class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n];
        int a = 0;
        
        for(int i=1; i<n; i++){
            if(n % i == 1){
                arr[a] = i;
                a++;
            }
        }
        answer = arr[0];
        return answer;
    }
}