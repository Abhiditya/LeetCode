class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int si=0, ei=s.length()-1;
        while(si<ei){
            while(si<ei && arr[si]!='a' && arr[si]!='e' && 
                arr[si]!='i' && arr[si]!='o' && 
                arr[si]!='u' && arr[si]!='A' && 
                arr[si]!='E' && arr[si]!='I' && 
                arr[si]!='O' && arr[si]!='U'){
                    si++;
            }
            while(si<ei && arr[ei]!='a' && arr[ei]!='e' && 
                arr[ei]!='i' && arr[ei]!='o' && 
                arr[ei]!='u' && arr[ei]!='A' && 
                arr[ei]!='E' && arr[ei]!='I' && 
                arr[ei]!='O' && arr[ei]!='U'){
                    ei--;
            }
            char temp = arr[si];
            arr[si++] = arr[ei];
            arr[ei--] = temp;
        }
        String str = new String(arr);
        return str;
    }
}