class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int count = numBottles;
        int emptyB = numBottles;
        while(emptyB >= numExchange){
            count += 1;
            emptyB = emptyB - numExchange + 1;
            numExchange += 1;
        }
        return count;
    }
}