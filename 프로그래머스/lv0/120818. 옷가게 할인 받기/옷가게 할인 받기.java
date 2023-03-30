class Solution {
    public int solution(int price) {
        
        // 0.05 = 5% = 0.95 , 0.1 = 10%, = 0.9  0.2 = 20% = 0.8
        
        if(price >= 500000){
            price *= 0.8;
        }
        else if(price >= 300000){
            price *= 0.9;
        }
        else if(price >= 100000){
            price *= 0.95;
        }
        
        return price;
    }
}