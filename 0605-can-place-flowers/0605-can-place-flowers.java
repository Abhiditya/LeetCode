class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && n>0) {
                if (i == 0 && (flowerbed.length == 1 || flowerbed[i + 1] != 1)) {
                    flowerbed[i] = 1;
                    n--;
                } else if (i == flowerbed.length - 1 && flowerbed[i - 1] != 1) {
                    flowerbed[i] = 1;
                    n--;
                } else if (i > 0 && i < flowerbed.length - 1 && flowerbed[i - 1] != 1 && flowerbed[i + 1] != 1) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        if(n==0) return true;
        return false;
    }
}