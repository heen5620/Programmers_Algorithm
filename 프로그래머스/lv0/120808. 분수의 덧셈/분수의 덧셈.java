public class Solution {
    
     // 최대공약수를 구하는 유클리드 호제법 메서드
    private static int findGCD(int a, int b) {
        while(b != 0){
            int result = b;
            b = a % b;
            a = result;
        }
        return a;
    }
    
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 두 분수의 합을 계산
        int numerator = numer1 * denom2 + numer2 * denom1;
        int denominator = denom1 * denom2;

        // 최대공약수를 구하기 위해 분자와 분모를 각각 약분
        int gcd = findGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        // 결과 배열에 분자와 분모를 담아서 반환
        int[] result = {numerator, denominator};
        return result;
    }

   
}
