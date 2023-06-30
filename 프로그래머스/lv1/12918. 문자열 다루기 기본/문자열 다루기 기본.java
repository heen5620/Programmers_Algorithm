class Solution {
    public boolean solution(String s) {
        char[] arr = new char[s.length()];
        if(s.length() != 4 && s.length() != 6){
            return false;
        }
        for(int i=0;i<s.length();i++){
            arr[i] = s.charAt(i);
            if(arr[i] < '0' || arr[i] > '9'){
                return false;
            }
        }
        return true;
    }
}