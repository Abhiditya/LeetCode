class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int count = 0;
        int n = status.length;

        boolean[] opened= new boolean[n];
        boolean[] hasKey= new boolean[n];
        boolean[] hasBox= new boolean[n];

        Queue<Integer> queue = new ArrayDeque<>();

        for(int i=0; i<initialBoxes.length; i++){
            hasBox[initialBoxes[i]]=true;
            if(status[initialBoxes[i]]==1) queue.add(initialBoxes[i]);
        }

        while(!queue.isEmpty()){
            int box= queue.poll();
            
            if (opened[box]) continue;
            opened[box]=true;
            count += candies[box];
            
            for (int key : keys[box]) {
                hasKey[key] = true;
                if (hasBox[key] && !opened[key]) queue.offer(key);
            }
            for (int contained : containedBoxes[box]) {
                hasBox[contained] = true;
                if ((status[contained] == 1 || hasKey[contained]) && !opened[contained]) queue.offer(contained);
            }
        }
        return count;
    }
}