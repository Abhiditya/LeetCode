class Solution {
    public boolean checkValidCuts(int m, int[][] rectangles) {
        int n=rectangles.length;
        int[][] x_axis= new int[n][2];
        int[][] y_axis= new int[n][2];
        for(int i=0; i<n; i++){
            x_axis[i][0]=rectangles[i][0];
            x_axis[i][1]=rectangles[i][2];
        }
        for(int i=0; i<n; i++){
            y_axis[i][0]=rectangles[i][1];
            y_axis[i][1]=rectangles[i][3];
        }
        for(int i=0; i<x_axis.length; i++){

        }
        
        return (sections(x_axis) | sections(y_axis));
    }

    private boolean sections(int[][] axis) {
        Arrays.sort(axis, (a, b) -> Integer.compare(a[0], b[0]));
        int n=axis.length;
        int sect=0;
        int high=axis[0][1];
        for(int i=0; i<n-1; i++){
            if(high<=axis[i+1][0]){
                sect++;
            }
            high=Math.max(high,axis[i+1][1]);
        }
        return sect>=2?true:false;
    }
}