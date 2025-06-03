class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int count=0;
        int n=status.length;
        boolean[] opened= new boolean[n];
        boolean[] key_found= new boolean[n];
        boolean[] box_found= new boolean[n];
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i=0; i<initialBoxes.length; i++){
            box_found[initialBoxes[i]]=true;
            if(status[initialBoxes[i]]==1) queue.add(initialBoxes[i]);
        }
        while(queue.peek()!=null){
            int box=queue.poll();
            if(!opened[box]){
                count+=candies[box];
                for(int i=0; i<containedBoxes[box].length; i++) {
                    box_found[containedBoxes[box][i]]=true;
                    if(key_found[containedBoxes[box][i]] || status[containedBoxes[box][i]]==1) queue.add(containedBoxes[box][i]);
                }
                for(int i=0; i<keys[box].length; i++) {
                    key_found[keys[box][i]]=true;
                    if(box_found[keys[box][i]]) queue.add(keys[box][i]);
                }
                opened[box]=true;
            }
        }
        return count;
    }
}