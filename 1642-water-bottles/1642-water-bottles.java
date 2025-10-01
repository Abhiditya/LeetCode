class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;
        while(numBottles >= numExchange){
            int temp = numBottles/numExchange;
            count += temp;
            numBottles = temp + numBottles % numExchange;
        }
        return count;
    }
}