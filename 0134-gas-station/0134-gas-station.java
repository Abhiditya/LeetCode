class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int idx=0, gas_curr=0, total=0;
        for(int i=0; i<n; i++){
            gas_curr= gas_curr+gas[i]-cost[i];
            if(gas_curr<0) {
                idx=i+1;
                gas_curr=0;
            }
            total+=gas[i]-cost[i];
        }
        if(total>=0) return idx;
        else return -1;
    }
}