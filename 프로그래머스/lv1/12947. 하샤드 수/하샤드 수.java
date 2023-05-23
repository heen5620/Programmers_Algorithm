class Solution {
    public boolean solution(int x) {
        String a = Integer.toString(x);
        int[] arr = new int[a.length()];
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(String.valueOf(a.charAt(i)));
            sum += arr[i];
        }
        
        if(sum != 0 && x % sum == 0){
            return true;
        }
        
        return false;
    }
}
