class Solution {
    public int solution(String str1, String str2) {
        int str2Length = str2.length();
        int str1Length = str1.length();

        for (int i = 0; i <= str1Length - str2Length; i++) {
            boolean found = true;
            for (int j = 0; j < str2Length; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return 1;
            }
        }
        return 2;
    }
}
