class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n=events.length;
        int day=1, si=0;
        int count=0;
        while(si<n || !pq.isEmpty()){
            while(si<n && events[si][0]<=day){
                pq.add(events[si][1]);
                si++;
            }
            
            while(!pq.isEmpty() && pq.peek()<day){
                pq.poll();
            }
            if(!pq.isEmpty()){
                pq.poll();
                count++;
                day++;
            }else if(si<n){
                day = events[si][0];
            }
        }
        return count;
    }
}