class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // for(char ch: magazine.toCharArray()){
        //     map.put(ch, map.getOrDefault(ch,0) + 1);
        // }
        // for(char ch: ransomNote.toCharArray()){
        //     if(!map.containsKey(ch))  return false;
        //     else{
        //         map.put(ch, map.get(ch) - 1);
        //         if(map.get(ch)==0)  map.remove(ch);
        //     }
        // }
        // return true;
        //2nd approach
        char[] arr1= magazine.toCharArray();
        char[] arr2= ransomNote.toCharArray();
        int[] arr3= new int[26];
        for(char ch: arr1){
            arr3[ch-'a']++;
        }
        for(char ch: arr2){
            arr3[ch-'a']--;
        }
        for(int val: arr3){
            if(val<0) return false;
        }
        return true;
    }
}