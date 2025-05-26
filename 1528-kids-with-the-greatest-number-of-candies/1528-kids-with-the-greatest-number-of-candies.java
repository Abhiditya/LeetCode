class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int i: candies){
            if(i>max) max=i;
        }
        List<Boolean> ll= new ArrayList<>();
        for(int val : candies) {
            if( val+extraCandies >= max ) ll.add(true);
            else ll.add(false);
        }
        return ll;
    }
}